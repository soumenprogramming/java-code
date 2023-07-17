import java.util.*;

class Reverse_number {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to reverse :");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int rev = 0;

        while (t != 0) {
            int remainder = t % 10;
            rev = (rev * 10)+ remainder;
            t = t / 10;
        }

        System.out.println("The reversed number is " + rev);
    }
}
