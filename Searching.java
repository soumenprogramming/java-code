import java.util.*;
public class Searching {
    public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number of the array :");
     int num=sc.nextInt();
     System.out.println("enter the numbers in the array :");
     int a[]=new int[num];
     for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
     }
     System.out.println("enter the desired number u want to find.");
     int t=sc.nextInt();
     for(int l=0;l<a.length;l++){
        if(a[l]==t){
            System.out.println("desired number is found.");
            return;
        }
    }
        
            System.out.println("desired number is not found.");
         
     }
     
}

