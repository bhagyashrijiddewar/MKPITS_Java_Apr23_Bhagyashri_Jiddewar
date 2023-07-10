package AssignmentArray2DDiamondTriangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter row values :");
        long row=scanner.nextLong();
        int row1=scanner.nextInt();
        //----------------by using array print pattern----------------------
        MergeInvertedTriangle mergeInvertedTriangle=new MergeInvertedTriangle();
        mergeInvertedTriangle.triangleMethodDeclaration(row1);

        //-----------------By using sout print pattern----------------------
        MergeTriangle mergeTriangle=new MergeTriangle();
        mergeTriangle.triangleMethodDeclaration(row1);

        //-----------------By using long datatypes--------------------------
//        LongDatatypeMergeTriangle longDatatypeMergeTriangle=new LongDatatypeMergeTriangle();
//        longDatatypeMergeTriangle.triangleMethodDeclaration(row);


    }
}
