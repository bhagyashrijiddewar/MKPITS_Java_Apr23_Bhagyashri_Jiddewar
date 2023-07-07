package Array2DMergeInvertedTriangle;

public class MergeInvertedTriangle extends TriangleMethodDeclaration {
    public void triangleMethodDeclaration(int row) {
        String[][] array = new String[row][row];
        int middleValue = row / 2;

        for (int rowCounter = 0; rowCounter < row; rowCounter++) {
            for (int columnCounter = 0; columnCounter < row; columnCounter++) {
                if (rowCounter <= middleValue) {
                    if (columnCounter == (middleValue - rowCounter) || columnCounter == (middleValue + rowCounter)) {
                        array[rowCounter][columnCounter]= "*";
                    } else {
                        array[rowCounter][columnCounter]= " ";
                    }
                } else {
                    if (columnCounter == middleValue - (row - 1 - rowCounter) || columnCounter == middleValue + (row - 1 - rowCounter)) {
                        array[rowCounter][columnCounter]= "*";
                    } else {
                        array[rowCounter][columnCounter]= " ";
                    }
                }
            }
        }
        for (String[] star : array) {
            for (String printStar : star) {
                System.out.print(printStar);
            }
            System.out.println();
        }
    }
}
