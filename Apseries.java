import java.util.*;
public class Apseries {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number and common difference of the AP series :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter the wished number of AP series :");
        int c=sc.nextInt();
        System.out.print("The AP series is :");
        for(int i=1;i<=c;i++){
            System.out.print(a +" ");
            a=a+b;
            
        }
        
    }
}
