
public class Pairsinarray {
    public static int getposition(int nums[]) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            for (int j = 0; j < nums.length; j++) {
                System.out.println("(" + cur + "," + nums[j] + ")");
                count++;
            }
            System.out.println();
        }
        return count; // Added return statement
    }

    public static void main(String[] args) {
        int nums[] = {1, 4, 7, 8, 7, 5, 8};
        int result = getposition(nums);
        System.out.println("Total pairs: " + result);
    }
}
