package Array1DPractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the array size :");
        int arrayInitialize=scanner.nextInt();
        StudentMarks studentMarks=new StudentMarks();
        studentMarks.displayMarks(arrayInitialize);
    }
}
