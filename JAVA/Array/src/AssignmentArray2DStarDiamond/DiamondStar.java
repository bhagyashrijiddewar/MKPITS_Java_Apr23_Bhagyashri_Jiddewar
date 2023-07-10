package AssignmentArray2DStarDiamond;
import java.util.Scanner;
public class DiamondStar {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the number of rows: ");
                int rows = sc.nextInt();
                int[] diamond = new int[rows];

                for (int i = 0; i < rows; i++) {
                    if (i <= rows / 2) {
                        diamond[i] = 2 * i - 1;
                    } else {
                        diamond[i] = 2 * (rows - i) - 1;
                    }
                }
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < diamond[i]; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }




