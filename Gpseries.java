import java.util.*;
public class Gpseries {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number and the common difference in GP series :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter the desired number of GP series :");
        int c=sc.nextInt();
        System.out.println("The GP series is :");
        for(int i=1;i<=c;i++){
         System.out.println(a+"");
         a=a*b;
        }
    }
}
