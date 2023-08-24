import java.util.*;

public class Primecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is prime or not: ");
        int t = sc.nextInt();
        boolean isPrime = true; 

        for (int i = 2; i <= t / 2; i++) {
            if (t % i == 0) {
                isPrime = false; 
                break; 
            }
        }

        if (isPrime) {
            System.out.println("It is a prime number.");
        } else {
            System.out.println("It is a nonprime number.");
        }
    }
}
