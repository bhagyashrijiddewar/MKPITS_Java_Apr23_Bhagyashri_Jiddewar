package SingleDimensionalArrayCubeOfEvery5thElement;
//------Create a class "Alternate5thElementAdditionSubstration"--------
//------class "Alternate5thElementAdditionSubstration" implements from interface "ArrayMethodDeclarationforCube"-----
public class Alternate5thElementAdditionSubstration implements ArrayMethodDeclarationforCube {
    @Override
    public void calculateAdditionSubstraction(){
        //--------Declare and initialize the variable "sum"----------
        int sum=0;
        //---------Initialize and declare the array---------------
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 15, 46, 23, 78, 89, 120, 123, 156, 145, 256, 356, 348, 560, 832, 567, 635, 123, 935, 578, 45, 36, 750, 26, 35, 125, 532, 632, 52, 20, 150};
        //----------Every 5th element can be display--------------
        //--------Loop starts with 4th index and incremented by 5-------
        for (int counter = 4; counter <array.length; counter=counter+5) {
            //--------Addition and substraction for alternate element---------
            //--------if the counter value is even then the condition can be true and execute the if statement---
            if(counter%2==0) {
                //--------Display every 5th element of an array element--------
                System.out.print(array[counter]+ "*"+array[counter]+"*"+array[counter] );
                System.out.print(" + ");
                //---------Sum of cube of every 5th element of an array-----------
                sum+=(array[counter]*array[counter]*array[counter]);
            }
            //--------if the counter value is not even then the condition can be false and execute the else statement---
            else {
                //--------Display every 5th element of an array element--------
                System.out.print(array[counter]+ "*"+array[counter]+"*"+array[counter] );
                System.out.print(" - ");
                //---------Substraction of cube of every 5th element of an array-----------
                sum-=(array[counter]*array[counter]*array[counter]);
            }

        }
        //-------Display the alternate addition and substraction  of the cube of 5th element of an array--------
        System.out.println(" : "+sum);


    }

}
