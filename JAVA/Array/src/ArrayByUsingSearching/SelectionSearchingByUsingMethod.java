package ArrayByUsingSearching;

import java.util.Scanner;

public class SelectionSearchingByUsingMethod {
    public void selectionSearchingMethod(int findNumber){
        int initialValue=0;
        int array[]={1,2,3,4,5,6,7,8,9};
        Scanner scanner=new Scanner(System.in);
        for( ;initialValue<array.length;initialValue++){
            if(findNumber==array[initialValue]){
                System.out.println("We can found the number on the index"+"[" +initialValue+"]");
                break;
            }
        }
        if(array.length==initialValue) {
            System.out.println("We can not found maching number");
        }
        }
}
