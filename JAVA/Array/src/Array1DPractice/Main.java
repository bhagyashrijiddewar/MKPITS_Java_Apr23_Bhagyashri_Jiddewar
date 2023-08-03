package Array1DPractice;

import ArrayByUsingSearching.BinarySearch;

import java.util.Scanner;

public class Main {
  public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter the array size :");
//        int arrayInitialize=scanner.nextInt();
//        StudentMarks studentMarks=new StudentMarks();
//        studentMarks.displayMarks(arrayInitialize);
      System.out.println("Enter the number between 1 to 9 :");
      int searchNumber= scanner.nextInt();
//      SelectionSearchingByUsingMethod selectionSortByUsingMethod=new SelectionSearchingByUsingMethod();
//      selectionSortByUsingMethod.selectionSearchingMethod(searchNumber);

//    ==================Binary Search========================
      BinarySearch binarySearch=new BinarySearch();
      if(binarySearch.isFoundMethod(searchNumber)){
          System.out.println("Number found");
      }else {
          System.out.println("Number not found");
      }
  }
}
