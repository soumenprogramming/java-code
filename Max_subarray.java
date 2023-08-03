import java.util.*;
public class Max_subarray{
public static int max_subarray(int arr[])
 {
    int max_sum=0;
    int cur_sum=0;
    for(int i=0;i<arr.length;i++){
        cur_sum=cur_sum+arr[i];
        if(cur_sum>max_sum){
            max_sum=cur_sum;
        }
        else if(cur_sum<0){
            cur_sum=0;
        }
    }
    return max_sum;
}
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array :");
        int t=sc.nextInt();
        int a[]=new int[t];
        System.out.println("enter the numbers in the array :");
        for(int j=0;j<a.length;j++){
            a[j]=sc.nextInt();
        }
        System.out.println(max_subarray(a));


    }

}


