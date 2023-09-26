package StudentGradTracker;

import StudentGradTracker.Course;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        LinkedList<Course> courses=new LinkedList<Course>();
        Course[] coursesArray=new Course[3];
        coursesArray[0]=new Course("JAVA",24,9);
        coursesArray[1]=new Course("C-Sharp",12,7.2);
        coursesArray[2]=new Course("DOT NET",8,6.5);

        courses.addAll(Arrays.asList(coursesArray));

        System.out.println("Enter the student name : ");
        Student student=new Student(scanner.next(),courses);
        System.out.println(student);
    }
}