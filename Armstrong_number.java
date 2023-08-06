import java.util.*;
public class Armstrong_number {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int num=sc.nextInt();
        int m=num;
        int sum=0;
        while(num>0){
            int r=num%10;
            num=num/10;
            sum=sum+r*r*r;
        }
        if(sum==m){
            System.out.println("It is a armstrong number :");
        }
        else{
            System.out.println("It is not a armstrong number :");
        }

    }
}
