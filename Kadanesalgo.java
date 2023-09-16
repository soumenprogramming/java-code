
import java.util.*;
public class Kadanesalgo {
     public int maxsubarray(int []nums){
        int sum=0,max=Integer.MIN_VALUE,i=0;
        while(i<nums.length){
            if(sum<0){
                sum=0;
            }
            sum=sum+nums[i];
            max=Math.max(max, sum);
            i++;
        }
        return max;
     }
     public static void main(String[]args){
        int nums[]={1,5,5,9,6,-10};
        Kadanesalgo kadane=new Kadanesalgo();
        System.out.println("The subarray is " +kadane.maxsubarray(nums));
     }
}
