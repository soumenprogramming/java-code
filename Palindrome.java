import java.util.*;
public class Palindrome {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number u want to check wheather it is palindrome or not :");
        int num=sc.nextInt();
        String str=Integer.toString(num);
        String str1=new StringBuilder(str).reverse().toString();
        if(str1.equalsIgnoreCase(str)){
            System.out.println("This is a palindrome number :");
        }
        else{
            System.out.println("This is not a palindrome number :");
        }
    }
}
