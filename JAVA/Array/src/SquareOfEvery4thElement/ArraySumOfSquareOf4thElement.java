package SquareOfEvery4thElement;

import SquareOfEvery4thElement.ArrayMethodDeclaration;

//------Create a class "SquareOfEvery4thElement.ArraySumOfSquareOf4thElement"--------
//------class "SquareOfEvery4thElement.ArraySumOfSquareOf4thElement" implements from interface "SquareOfEvery4thElement.ArrayMethodDeclaration"-----
public class ArraySumOfSquareOf4thElement implements ArrayMethodDeclaration {
    @Override
  public void calculateSumOfSquareOf4thElement(){
        //--------Declare and initialize the variable "sum"----------
      int sum=0;
      //---------Initialize and declare the array---------------
  int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 15, 46, 23, 78, 89, 120, 123, 156, 145, 256, 356, 348, 560, 832, 567, 635, 123, 935, 578, 45, 36, 750, 26, 35, 125, 532, 632, 52, 20, 150};
      //----------Every 4th element can be display--------------
        //--------Loop starts with 3rd index and incremented by 4-------
  for (int counter = 3; counter <array.length; counter=counter+4) {
      //--------Display every 4th element of an array element--------
      System.out.print(array[counter]+ "*"+array[counter] );
      System.out.print(" + ");
      //---------Sum of square of every 4th element of an array-----------
      sum+=(array[counter]*array[counter]);
      }
      //-------Display the addition of the square of 4th element of an array--------
      System.out.println(" : "+sum);
  }
  }



