
/**
 * <h1>Sum of square of every 4th element in an array</h1>
 * <p> "ArraySumOfSquareOf4thElement" program implements an application that add the square
 * of every 4th element and Prints the final output on the screen.
 * </p>
 * "ArraySumOfSquareOf4thElement" class implements an interface "ArrayMethodDeclaration".
 *
 * @author  Bhagyashri Jiddewar
 * @version 1.0
 * @since   2023/07/03
 */
package SingleDimensionalArraySquareOfEvery4thElement;

//import SquareOfEvery4thElement.ArrayMethodDeclaration;
public class ArraySumOfSquareOf4thElement implements ArrayMethodDeclaration {
    /**
     * This method is used to add the square of every 4th element,this is the simplest form of class method.
     *
     * @override method "calculateSumOfSquareOf4thElement" from interface.
     * @array array - Declared and initialized the array of [40] indexes,the range for index is upto 1000.
     * @ param sum This is the final parameter where we can store the final result of "calculateSumOfSquareOf4thElement"method.
     * @ param counter This is the first parameter of the loop.
     * <h1>Sum of square of every 4th element of an array</h1>
     * <p>loop starts with counter=3, check the condition counter<array.length,
     * if the condition is true it will execute the operation and execute the increment statement.
     * The loop can be executed till the last value can be executed.
     * </p>
     * Example: counter=3;
     * condition: counter<array.length--> true
     * sum=sum+(array[counter]*array[counter]);
     * 0=0+(4*4)=16
     * sum=16;
     * counter+4;
     * Again loop starts and follow the same procedure till the last value can be executed.
     * The final addition value stored and display in the "sum" parameter.
     */
    @Override
    public void calculateSumOfSquareOf4thElement() {
        int sum = 0;

        //---------Initialize and declare the array---------------
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 15, 46, 23, 78, 89, 120, 123, 156, 145, 256, 356, 348, 560, 832, 567, 635, 123, 935, 578, 45, 36, 750, 26, 35, 125, 532, 632, 52, 20, 150};

        //---------Loop starts with 3rd index and incremented by 4-------
        System.out.println("Sum of square of every 4th element of an array :");

        for (int counter = 3; counter < array.length; counter = counter + 4) {

            //--------Display every 4th element of an array element--------

            System.out.print(array[counter] + "*" + array[counter]+" " +"+");
           // System.out.print(" + ");

            //---------Sum of square of every 4th element of an array-----------

            sum += (array[counter] * array[counter]);
        }

        //-------display final addition value --------
        System.out.println("= " + sum);
    }
}



