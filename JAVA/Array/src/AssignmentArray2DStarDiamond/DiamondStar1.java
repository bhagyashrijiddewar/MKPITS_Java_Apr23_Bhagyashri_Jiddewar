package AssignmentArray2DStarDiamond;
import java.util.Scanner;

public class DiamondStar1 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows: ");
            int rows = sc.nextInt();

            // Create a 2D array to store the diamond star pattern
            int[][] diamond = new int[rows][rows];

            // Fill the array with stars and spaces
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < rows; j++) {
                    if (i == j || i + j == rows - 1) {
                        diamond[i][j] = 1;
                       // System.out.print("*");
                    } else {
                         diamond[i][j] = 0;
                      //  System.out.print(" ");
                    }
                }
            }
            // Print the 2D array
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < rows; j++) {
                    System.out.print(diamond[i][j]);
                }
                System.out.println();
            }
        }
    }


