import java.util.Scanner;

class Sumofevenodd {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the size of the array :");
            int t = sc.nextInt();
            int a[] = new int[t];
            System.out.println("enter the numbers in the array :");
            for (int i = 0; i < t; i++) {
                a[i] = sc.nextInt();
            }
            int sum1 = 0, sum2 = 0;
            for (int j = 0; j < t; j++) {
                if (j % 2 == 0) {
                    sum1 += a[j];
                } else {
                    sum2 += a[j];
                }
            }
            System.out.println("The sum of the even position is " + sum1);
            System.out.println("The sum of the odd position is " + sum2);
        }
    }
}
