import java.util.*;
public class Even_Oddsum {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int t=sc.nextInt();
        int evensum=0,oddsum=0;
        for (int i = 1; i <= t; i++) {
            if (i % 2 == 0) {
                evensum += i;
            } else {
                oddsum += i;
            }
        }

        System.out.println("oddsum is" +oddsum);
        System.out.println("evensum is" +evensum);
    }
}
