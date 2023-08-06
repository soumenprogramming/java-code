import java.util.*;
public class Maxelementofarray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the desired size of the array.");
        int t=sc.nextInt();
        int a[]=new int[t];
        System.out.println("enter the numbers in the array.");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int max=a[a.length-1];
        System.out.println("The maximum element is :"+max);

    }
}
