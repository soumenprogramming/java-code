public class Insertionsort {
    public static void insert(int nums[]) {
        for (int i = 1; i < nums.length; i++) {
            int curr = i;
            int prev = i - 1;

            while (prev >= 0 && nums[prev] > nums[curr]) {
                int temp = nums[prev];
                nums[prev] = nums[curr];
                nums[curr] = temp;
                curr--;
                prev--;
            }
        }
    }

    public static void ins(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = {1, 4, 7, 5, 2, 8};
        insert(nums);
        ins(nums);
    }
}
