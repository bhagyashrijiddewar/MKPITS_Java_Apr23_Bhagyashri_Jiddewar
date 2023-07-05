package MultidimensionalArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first array size :");
        int firstDimensionValue=scanner.nextInt();
        System.out.println("Enter the second array size :");
        int secondDimensionValue=scanner.nextInt();
        System.out.println("Enter the third array size :");
        int thirdDimensionValue=scanner.nextInt();

        Array3DStudentMarks array3DStudentMarks=new Array3DStudentMarks();
        array3DStudentMarks.array3DUserInput(firstDimensionValue,secondDimensionValue,thirdDimensionValue);

    }
}
