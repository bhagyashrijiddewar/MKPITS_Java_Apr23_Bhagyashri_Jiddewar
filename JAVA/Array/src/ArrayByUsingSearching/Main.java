package ArrayByUsingSearching;

import java.util.Scanner;

public class Main {

        public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the number between 1 to 9 :");
            int searchNumber= scanner.nextInt();

            System.out.println("--------Selection Search------------");
            SelectionSearchingByUsingMethod selectionSortByUsingMethod=new SelectionSearchingByUsingMethod();
            selectionSortByUsingMethod.selectionSearchingMethod(searchNumber);
            System.out.println("--------**********---------");
//    ==================Binary Search========================
            System.out.println("--------Binary Search------------");
            BinarySearch binarySearch=new BinarySearch();
            if(binarySearch.isFoundMethod(searchNumber)){
                System.out.println("Number found");
            }else {
                System.out.println("Number not found");
            }
        }
    }


