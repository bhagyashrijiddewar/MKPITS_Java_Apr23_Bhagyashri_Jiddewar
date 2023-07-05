package Array2D;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row value = ");
        int inputRow = scanner.nextInt();
        System.out.println("Enter the column value = ");
        int inputColumn = scanner.nextInt();

        Array2DProgram array2DProgram=new Array2DProgram();
        array2DProgram.print2DArrayByUserInput(inputRow,inputColumn);

    }
}
