package Array1DPractice;
import java.util.Scanner;

public class StarProgram {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of rows: ");
            int rows = sc.nextInt();

            // Create an array to store the stars
            String[] stars = new String[rows];

            // Initialize the array with spaces
            for (int i = 0; i < rows; i++) {
                stars[i] = "";
            }

            // Fill the array with stars
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j <= i; j++) {
                    stars[i] += "*";
                }
            }
            // Print the array
            for(String star : stars) {
                System.out.println(star);
            }
        }
    }
