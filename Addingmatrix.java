import java.util.*;

class AddingMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows for the first matrix:");
        int aRows = sc.nextInt();
        System.out.println("Enter the number of columns for the first matrix:");
        int aCols = sc.nextInt();
        int a[][] = new int[aRows][aCols];

        System.out.println("Enter the elements for the first matrix:");
        for (int i = 0; i < aRows; i++) {
            for (int j = 0; j < aCols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the number of rows for the second matrix:");
        int bRows = sc.nextInt();
        System.out.println("Enter the number of columns for the second matrix:");
        int bCols = sc.nextInt();
        int b[][] = new int[bRows][bCols];

        System.out.println("Enter the elements for the second matrix:");
        for (int i = 0; i < bRows; i++) {
            for (int j = 0; j < bCols; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        if (aRows != bRows || aCols != bCols) {
            System.out.println("Matrices cannot be added. They have different dimensions.");
        } else {
            int result[][] = new int[aRows][aCols];
            for (int i = 0; i < aRows; i++) {
                for (int j = 0; j < aCols; j++) {
                    result[i][j] = a[i][j] + b[i][j];
                }
            }

            System.out.println("After adding the matrices:");
            for (int i = 0; i < aRows; i++) {
                for (int j = 0; j < aCols; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
