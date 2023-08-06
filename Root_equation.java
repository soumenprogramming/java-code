import java.util.*;

public class Root_equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coefficients (a, b, c) of the equation ax^2 + bx + c:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double r = (b * b) - (4 * a * c);
        if (r < 0) {
            System.out.println("Not possible to calculate real roots.");
        } else {
            r = Math.sqrt(r);
            double s = (-b + r) / (2.0 * a);
            double t = (-b - r) / (2.0 * a);

            if (s > t) {
                double temp = s;
                s = t;
                t = temp;
            }

            System.out.println("Roots of the equation are: " + s + " " + t);
        }
    }
}
