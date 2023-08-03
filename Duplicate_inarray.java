import java.util.*;
public class Duplicate_inarray{
public static boolean Duplicate(int a[]){
    for(int i=0;i<a.length;i++){
        for(int j=0;j<i;j++){
            if(a[i]==a[j]){
                return true;
            }
        }
       
    }
     return false;
    
}
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of the array :");
    int t=sc.nextInt();
    int a[]=new int[t];
    System.out.println("enter the numbers of the array :");
    for(int j=0;j<a.length;j++){
        a[j]=sc.nextInt();
        
    }
    System.out.println(Duplicate(a));

} 
}

