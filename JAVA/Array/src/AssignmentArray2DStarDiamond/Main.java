package AssignmentArray2DStarDiamond;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
       int row= scanner.nextInt();
        Array2DStarDiamond array2DStarDiamond=new Array2DStarDiamond();
        array2DStarDiamond.starDiamondMethodDeclaration(row);
    }
}
