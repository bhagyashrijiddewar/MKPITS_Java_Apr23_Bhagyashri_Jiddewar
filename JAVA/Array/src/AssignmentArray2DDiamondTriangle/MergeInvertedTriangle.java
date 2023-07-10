package AssignmentArray2DDiamondTriangle;

public class MergeInvertedTriangle extends TriangleMethodDeclaration {
    public void triangleMethodDeclaration(int row) {
        String[][] array = new String[row][row];
        int middleValue = (row / 2)+1;

        for (int rowCounter = 0; rowCounter < row; rowCounter++) {
            for (int columnCounter = 0; columnCounter < row; columnCounter++) {
                if (rowCounter <= middleValue) {
                    if (columnCounter == (middleValue - rowCounter) || columnCounter == (middleValue + rowCounter)) {
                         array[rowCounter][columnCounter]= "*";
                       // System.out.print("*");
                    } else {
                        array[rowCounter][columnCounter]= " ";
                       // System.out.print(" ");
                    }
                } else {
                    if (columnCounter == middleValue - (row - 1 - rowCounter) || columnCounter == middleValue + (row - 1 - rowCounter)) {
                        array[rowCounter][columnCounter]= "*";
                      //  System.out.print("*");
                    } else {
                        array[rowCounter][columnCounter]= " ";
                        //System.out.print(" ");
                    }
                }
            }
           // System.out.println();
        }
        for(String[] star:array){
            for(String starValue:star){
                System.out.print(starValue);
            }
            System.out.println();

        }
    }
}
