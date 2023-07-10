package Array1DPractice;

import java.util.Scanner;

public class ComputeSquareOfAnArray {

    public static void main(String[] args){
        int value;
        int result=0;
        int array[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        System.out.println("Display the array list : ");
        for(int firstValue=0;firstValue<array.length;firstValue++){
            System.out.print(" "+array[firstValue]);
        }
        System.out.println();
        System.out.println("Display Every 3rd element list of an array :");
        for( value=2;value<array.length;value=value+3) {
            System.out.print(" "+array[value]);
        }
        System.out.println();
        System.out.print("Display the square of  Every 3rd element list of an array :");
        System.out.println();
        for( value=2;value<array.length;value=value+3) {
            result=result+(array[value]*array[value]);
            System.out.print(+array[value]+"*"+array[value]+" + ");
        }
        System.out.println();
        System.out.println("The final Addition of Squares of every 3rd element : ");
        System.out.print(" ="+result);

    }
}
