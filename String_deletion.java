import java.util.*;
public class String_deletion {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=sc.nextLine();
        String str1="";
        for(int i=0;i<str.length();i++){
            if(i%2==0){
             str1+=str.charAt(i);
            }
        }
        System.out.println("The updated String is :"+str1);

    }
}
