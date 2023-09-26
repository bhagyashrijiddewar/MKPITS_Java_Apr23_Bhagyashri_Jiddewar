package HashTable;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintArrayUsingHashTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//------------------------------------------------------------------
//        ArrayList<Integer> employeeList=new ArrayList<Integer>();
//          Integer[] intValue=new Integer[10];
//        System.out.println("Enter the array values : ");
//        for(int number=0;number<10;number++){
//            int value= scanner.nextInt();
//            intValue[value%10]=value;
//        }
//        System.out.println("Print array values : ");
//        for(int number=0;number<10;number++){
//            System.out.print(intValue[number]+" ");
//        }
//        System.out.println();

//--------------------------------------------------------------------
        int[] array = new int[10];
        int counter = 0;
        int value;
        System.out.println("Enter the array values : ");
        for (int number = 0; number < 10; number++) {
            value = scanner.nextInt();
            array[value % 10] = value;
        }
        System.out.println("Print array values : ");
        for (int number = 0; number < 10; number++) {
            System.out.print(array[number] + " ");
        }
        System.out.println();
        System.out.println("Count the array values = ");
        for (int number = 0; number < 10; number++) {
            if (array[number] != 0) {
                counter++;
            }
        }
        double loadFactor = (double) counter / 10.0;
        System.out.println("Load Factor = " + loadFactor);

        int newArray[] = new int[counter];
        for (int number = 0,newCounter=0; number < 10; number++) {
            if (array[number] != 0) {
                newArray[newCounter] = array[number];
                newCounter++;
            }
        }
        System.out.println("Print the new array list by using");
        for(int newArraysValue:newArray){
            System.out.println(newArraysValue);
        }
    }
}