import java.util.*;

class Sum_AverageofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array :");
        int t = sc.nextInt();
        int a[] = new int[t]; 
        System.out.println("enter the number of the array:");
        float sum = 0;

        for (int i = 0; i < t; i++) {
            a[i] = sc.nextInt(); 
            sum = sum + a[i]; 
        }

        float average = sum / t; 

        System.out.printf("%.2f", average); 
    }
}
