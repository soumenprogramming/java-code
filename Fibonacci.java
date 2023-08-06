import java.util.*;
public class Fibonacci {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of terms in fibonacci series :");
        int t=sc.nextInt();
        int num1=0;
        int num2=1;
        System.out.println("Fibonacci Series is :");
        for(int i=1;i<=t;i++){
           int num3=num1+num2;
           System.out.println(num1);
           num1=num2;
           num2=num3;
        }
    }
}
