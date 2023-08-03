package ArrayByUsingSorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args){
        int initialValue=0;
        int array[]={1,2,3,4,5,6,7,8,9};
        System.out.println("Enter any one number between 1 to 9 :");
        Scanner scanner=new Scanner(System.in);
        int findNumber=scanner.nextInt();
        for( ;initialValue<array.length;initialValue++){
            if(findNumber==array[initialValue]){
                System.out.println("We found a maching number");
                break;
            }
        }
        if(array.length==initialValue){
                    System.out.println("We can not found maching number");

        }
    }
}
