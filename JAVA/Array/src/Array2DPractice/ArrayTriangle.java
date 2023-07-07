package Array2DPractice;

import java.util.Scanner;

public class ArrayTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        // Create a 2d array to store the stars
        String[][] stars = new String[rows][rows];

        // Initialize the array with spaces
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                stars[i][j] = " ";
            }
        }
        // Fill the array with stars
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                stars[i][j] = "*";
            }
        }
        // Print the array
        for (String[] star : stars) {
            for (String s : star) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
