/**
 * This is the main method which makes use of "calculateSumOfSquareOf4thElement" method.
 * <p>Here we can create an object "arraySumOfSquareOf4thElement" of class "ArraySumOfSquareOf4thElement",
 * to make a use of "calculateSumOfSquareOf4thElement" method.</p>
 */
package SquareOfEvery4thElement;

import SquareOfEvery4thElement.ArrayMethodDeclaration;
import SquareOfEvery4thElement.ArraySumOfSquareOf4thElement;

public class Main {
    public static void main(String[] args) {
        //------Create an object "arraySumOfSquareOf4thElement" of class "ArraySumOfSquareOf4thElement" ----------
        //-----------ArrayMethodDeclaration is an interface-----------------

        ArrayMethodDeclaration arraySumOfSquareOf4thElement=new ArraySumOfSquareOf4thElement();
        //------call the method "calculateSumOfSquareOf4thElement()" by using object "arraySumOfSquareOf4thElement"-----

        arraySumOfSquareOf4thElement.calculateSumOfSquareOf4thElement();
    }
}