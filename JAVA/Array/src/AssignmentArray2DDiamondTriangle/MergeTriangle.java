package AssignmentArray2DDiamondTriangle;
public class MergeTriangle extends TriangleMethodDeclaration {
    public void triangleMethodDeclaration(int row) {
        int [][] array=new int[ row][ row];
        int middleValue=row/2;

        for(long rowCounter=0;rowCounter<row;rowCounter++){
            for(long columnCounter=0;columnCounter<row;columnCounter++){
                if(rowCounter<=middleValue){
                    if(columnCounter==(middleValue-rowCounter) || columnCounter==(middleValue+rowCounter)){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }else{
                    if(columnCounter==middleValue-(row-1-rowCounter) || columnCounter==middleValue+(row-1-rowCounter)){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}



