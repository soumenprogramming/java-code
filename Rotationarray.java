import java.util.*;
public class Rotationarray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array :");
        int t=sc.nextInt();
        System.out.println("enter the numbers of the array :");
        int a[]=new int[t];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();

        }
        int temp=a[0];
        for(int j=1;j<a.length;j++){
            a[j-1]=a[j];
        }
        a[a.length-1]=temp;
        System.out.print("after rotation :");
        for(int rt:a){
            System.out.print(rt+" ");
            
        }
    }
}
