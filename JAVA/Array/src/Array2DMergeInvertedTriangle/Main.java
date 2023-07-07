package Array2DMergeInvertedTriangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter row values :");
        int row=scanner.nextInt();

        MergeInvertedTriangle mergeInvertedTriangle=new MergeInvertedTriangle();
        mergeInvertedTriangle.triangleMethodDeclaration(row);
//        MergeTriangle mergeTriangle=new MergeTriangle();
//        mergeTriangle.triangleMethodDeclaration(row);



    }
}
