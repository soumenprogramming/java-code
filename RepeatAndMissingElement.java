import java.util.Arrays;

public class RepeatAndMissingElement {
    public int[] findRepeatAndMissing(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] result = new int[2];
        
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                result[0] = nums[i]; 
                break; 
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                result[1] = i + 1; 
                break;
            }
        }

    
        if (result[1] == 0) {
            result[1] = n;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 2, 4};
        RepeatAndMissingElement nr = new RepeatAndMissingElement();
        int[] result = nr.findRepeatAndMissing(nums);

        System.out.println("Repeating Element: " + result[0]);
        System.out.println("Missing Element: " + result[1]);
    }
}
