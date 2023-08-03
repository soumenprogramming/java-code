import java.util.*;
public class Reverse_array{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array :");
        int t=sc.nextInt();
        int a[]=new int[t];
        System.out.println("enter the numbers in the array :");
        for(int i=0;i<t;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("The reversed array is :");
        for(int j=t-1;j>=0;j--){
            System.out.print(a[j]+"");
        }
    }

    
}
