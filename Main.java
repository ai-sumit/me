import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();

        // Upper half of diamond
        for (int i = 1; i <= rows; i++) {
            // Spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of diamond
        for (int i = rows - 1; i >= 1; i--) {
            // Spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}