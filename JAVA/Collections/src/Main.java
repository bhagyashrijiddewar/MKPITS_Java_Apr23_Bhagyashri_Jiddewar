import LinkList.Student;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String string=" ";

          LinkedList <Student> linkedList=new LinkedList();
        Scanner scanner=new Scanner(System.in);

        do{
          System.out.println("Enter the name of the student : ");
          String name=scanner.next();
          System.out.println("Enter the marks os the student : ");

          int marks=scanner.nextInt();
            Student student=new Student(name,marks);
            linkedList.add(student);

            System.out.println("If you want to add another record, press 'yes' it not press 'no' ");
            string=scanner.next();
        }while(string.equalsIgnoreCase("yes"));

            for (Student student1 : linkedList) {
                System.out.println("Student name : "+student1.getName() );
                System.out.println("Student Marks : "+ student1.getMarks());
            }


    }
}