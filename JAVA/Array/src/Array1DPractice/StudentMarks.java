package Array1DPractice;

import java.util.Scanner;

public class StudentMarks {
    public void displayMarks(int arrayInitialize) {
        Scanner scanner=new Scanner(System.in);
        int[] marks = new int[arrayInitialize];

        //input
        System.out.println("Enter the array value :");
        for(int startValue=0;startValue<marks.length;startValue++){
            marks[startValue]=scanner.nextInt();
        }

        //output
        System.out.println("Display the array size with there values :");
        for(int startValue=0;startValue<marks.length;startValue++){
            System.out.println("marks["+startValue+"] = "+marks[startValue]);
        }
    }
}
