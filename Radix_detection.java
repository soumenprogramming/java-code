import java.util.*;
public class Radix_detection {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        String t=sc.nextLine();
        if(t.matches("[01]+")){
            System.out.println("Radix is 2");
        }
        else if(t.matches("[0-7]+")){
            System.out.println("Radix is 8");
        }
        else if(t.matches("[0-9]+")){
            System.out.println("Radix is 10");
        }
        else if(t.matches("[0-9A-F]+")){
            System.out.println("Radix is 16");
        }
        else{
            System.out.println("entered number is invalid");
        }
    }
}
