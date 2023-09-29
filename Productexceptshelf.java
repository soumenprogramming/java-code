public class Productexceptshelf {
    public int[] product(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] rightside1 = new int[n];
        int[] leftside1 = new int[n];
        int rightside = 1;
        int leftside = 1;
        
        for (int i = 0; i < n; i++) {
            rightside1[i] = rightside;
            rightside *= nums[i];
        }
        
        for (int i = n - 1; i >= 0; i--) {
            leftside1[i] = leftside;
            leftside *= nums[i];
        }
        
        for (int i = 0; i < n; i++) {
            result[i] = leftside1[i] * rightside1[i];
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int nums[] = { 1, 2, 8, 9 };
        Productexceptshelf obj = new Productexceptshelf();
        int result[] = obj.product(nums);
        
        
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
