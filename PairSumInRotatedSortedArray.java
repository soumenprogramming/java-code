public class PairSumInRotatedSortedArray {
    public boolean findPairWithSum(int[] nums, int target) {
        int n = nums.length;
        if (n < 2) {
            return false; 
        }

        int left = 0;
        int right = n - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                return true; 
            } else if (sum < target) {
                left = (left + 1) % n;
            } else {
                right = (right - 1 + n) % n; 
            }

            if (left == right) {
                left++;
                right--;
            }
        }

        return false; 
    }

    public static void main(String[] args) {
        PairSumInRotatedSortedArray solution = new PairSumInRotatedSortedArray();
        int[] nums = {4, 5, 6, 7, 0, 1, 2}; 
        int target = 9;

        boolean foundPair = solution.findPairWithSum(nums, target);
        System.out.println("Pair with sum " + target + " found: " + foundPair); 
    }
}
