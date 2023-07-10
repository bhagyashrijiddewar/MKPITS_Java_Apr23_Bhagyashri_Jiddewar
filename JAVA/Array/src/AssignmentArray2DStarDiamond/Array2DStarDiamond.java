package AssignmentArray2DStarDiamond;

public class Array2DStarDiamond extends StarDiamondMethodDeclaration {
    public void starDiamondMethodDeclaration(int row){
        int[][] array = new int[row][row];
        int middleValue = row / 2;

        for(int rowCounter=0;rowCounter<row;rowCounter++){
            for(int columnCounter=0;columnCounter<row;rowCounter++){
                if (rowCounter <= middleValue) {
                    if(columnCounter==middleValue-rowCounter || columnCounter==middleValue ||columnCounter==middleValue+rowCounter){

                    }
                }
            }
        }

    }

}
