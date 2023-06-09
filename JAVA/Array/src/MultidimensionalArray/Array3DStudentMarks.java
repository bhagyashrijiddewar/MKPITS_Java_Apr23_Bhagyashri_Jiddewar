package MultidimensionalArray;

import java.util.Scanner;
public class Array3DStudentMarks extends MultidimensionalArrayMethodDeclaration {
    public void array3DUserInput(int firstDimensionValue,int secondDimensionValue,int thirdDimensionValue){
        Scanner scanner=new Scanner(System.in);
        int[][][] array=new int[firstDimensionValue][secondDimensionValue][thirdDimensionValue];

        //input
        System.out.print("Enter the 3D-array Values : ");
        for(int row=0;row<firstDimensionValue;row++){
            for(int column=0;column<secondDimensionValue;column++){
                for(int thirdArraySize=0;thirdArraySize<thirdDimensionValue;thirdArraySize++){
                    array[row][column][thirdArraySize]=scanner.nextInt();
                }
            }
        }
        //output
        System.out.println("Display the 3D-array output : ");
        for(int row=0;row<firstDimensionValue;row++){
            for(int column=0;column<secondDimensionValue;column++){
                for(int thirdArraySize=0;thirdArraySize<thirdDimensionValue;thirdArraySize++){
                    System.out.print(array[row][column][thirdArraySize]);
                }
                System.out.println();
            }
        }
    }
}
