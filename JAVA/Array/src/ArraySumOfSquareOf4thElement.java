public class ArraySumOfSquareOf4thElement implements ArrayMethodDeclaration {
  public void calculateSumOfSquareOf4thElement(){
      int sum=0;
  int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 15, 46, 23, 78, 89, 120, 123, 156, 145, 256, 356, 348, 560, 832, 567, 635, 123, 935, 578, 45, 36, 750, 26, 35, 125, 532, 632, 52, 20, 150};
  for (int counter = 3; counter <array.length; counter=counter+4) {
      //if(counter==array[3]&&counter==array[7]&&counter==array[11]&&counter==array[15]&&counter==array[19]&&counter==array[23]&&counter==array[27]&&counter==array[31]&&counter==array[35]&&counter==array[39]) {
      System.out.print(array[counter]+ "*"+array[counter] );
      System.out.print(" + ");
      sum+=(array[counter]*array[counter]);
      }
      System.out.println(" : "+sum);
  }
  }



