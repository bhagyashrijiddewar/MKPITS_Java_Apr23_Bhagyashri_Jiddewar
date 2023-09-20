import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array={20,50,10,5,80};
        int[] arrayNew={20,50,10,5,80};
        char[] charactor={'A','G','J','E','B','H'};
        double[] doubles={50,21,62,14};
        int[] arrayNew1={1,9,5,2};

        Arrays.sort(array);
        Arrays.sort(arrayNew);
        Arrays.sort(charactor);
        // In binary search we can not directly search the value,we need to sort the array first.
        System.out.println("Search the integer value index in the array :"+Arrays.binarySearch(array,50));
        System.out.println("Search the character value index in the array : "+Arrays.binarySearch(charactor,'E'));
//      The answer of the bellow statement is in negative becz the element not fount in the array and display the
//         insertion value can be expected in that position in negative manner.
//        formula is (-(insertion value)-1)==>> Example: (-(4)-1)=-5 in the below statement.
//------------------------------------------------------------
        System.out.println("Search the double value index in the array : "+Arrays.binarySearch(doubles,66));
//        ---------------------------------------------------
        System.out.println("Compare two array : "+Arrays.compare(array,arrayNew));
//---------------------------------------------------------
        System.out.println("Compare unsign variable in the array : "+Arrays.compareUnsigned(array,arrayNew));
//        -------------------------------------------------
        System.out.println("copy array in another array but it treated as a string : "+Arrays.toString(Arrays.copyOf(arrayNew,7)));
//        --------------------------------------------------
        int[]copyArray=Arrays.copyOf(arrayNew,10);
        System.out.print("copy array in another array and it treated as array: ");
           for(int value:copyArray){
            System.out.print(value+" ");
        }
        System.out.println();
//     -----------------------------------------------------------
        System.out.print("copy of an array in another array from defining the range :");
       int[] copyRangeArray=Arrays.copyOfRange(arrayNew,1,6);
           for(int value:copyRangeArray){
               System.out.print(value+" ");
           }
        System.out.println();
//     ------------------------------------------------------------------------

        System.out.println("We can check the two array are equal or not : "+Arrays.equals(array,arrayNew1));
        System.out.println("We can check the two array are equal or not : "+Arrays.equals(array,arrayNew));
//     ------------------------------------------------------------------------
        System.out.print("By default literals value can be display : ");
        boolean[]booleans=new boolean[5];
        for(boolean value:booleans){
            System.out.print(value+" ");
        }
        System.out.println();
//     -------------------------------------------------------------------------

        System.out.print("By default literals value can be display : ");
        boolean[]booleansNew=new boolean[5];
        Arrays.fill(booleansNew,true);
        for(boolean value:booleansNew){
            System.out.print(value+" ");
        }
        System.out.println();
//        -----------------------------------------------------------------------------
      List list=  Arrays.asList(1,5,6,2,4);
//        list.add(10);    // Exception in thread "main" java.lang.UnsupportedOperationException
        //We can not add new element, it is in a fix size.
        System.out.println("asList method accepts variable arguments : "+list);

//      -----------------------------------------------------------------------------









    }
}