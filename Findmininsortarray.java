import java.util.Arrays;
public class Findmininsortarray {
    public int findmin(int []nums){
        Arrays.sort(nums);
        return nums[0];

    }
    public static void main(String[]args){
        int a[]={1,5,8,9,6,10};
        Findmininsortarray ar=new Findmininsortarray();
        int a1=ar.findmin(a);
        System.out.println(a1);
    }
}
