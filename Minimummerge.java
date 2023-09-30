public class Minimummerge {
    public int minMerge(int nums[]) {
        int count = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if (nums[left] == nums[right]) {
                left++;
                right--; 
            } else if (nums[left] < nums[right]) {
                nums[left + 1] += nums[left];
                left++;
                count++;
            } else {
                nums[right - 1] += nums[right];
                right--;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 8, 8, 2 };
        Minimummerge min1 = new Minimummerge();
        int n1 = min1.minMerge(nums);
        System.out.println(n1);
    }
}
