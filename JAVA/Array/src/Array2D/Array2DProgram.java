package Array2D;

import java.util.Scanner;

public class Array2DProgram {
    public  void print2DArrayByUserInput (int inputRow,int inputColumn){
          Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter the row value = ");
//        int inputRow=scanner.nextInt();
//        System.out.println("Enter the column value = ");
//        int inputColumn=scanner.nextInt();

        int[][] array=new int[inputRow][inputColumn];
        //input
        //row value
        System.out.println("Enter the input value for array elements : ");
        for(int row=0;row<inputRow;row++){
            //column value
            for(int column=0;column<inputColumn;column++){
                array[row][column]=scanner.nextInt();
                System.out.println("array["+row+"]["+column+"] ="+array[row][column]);
            }
        }
        //output
        //row
        System.out.println("Display the output of an array :");
        for(int row=0;row<inputRow;row++){
            //column
            for(int column=0;column<inputColumn;column++){
                System.out.println("array["+row+"]["+column+"] ="+array[row][column]);
            }
        }
    }
}
