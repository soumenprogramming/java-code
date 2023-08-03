import java.util.*;
class Min_max{
    public static void Min_Max(int nums[]){
        int max=nums[0];
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max= nums[i];
            }
            else if(nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println("The minimum is "+min);
        System.out.println("The maximum is "+max);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array :");
        int j=sc.nextInt();
        
        System.out.println("enter the numbers of the array :");
        int a[]=new int[j];
        for(j=0;j<a.length;j++){
            a[j]=sc.nextInt();
        }
         
        Min_Max(a);
    }
}