package ComparebleANdComparatorInterface.StudentListSortingByLambdaExpression;

import ComparebleANdComparatorInterface.StudentListSortingByAnonimousClass.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class MainStudentListSortByLambdaExpression {

    public static void main(String[] args) {

        LinkedList<Student> linkedList = new LinkedList<Student>();
    Student[] students = new Student[4];
    students[0] = new Student("Pranay", 90);
    students[1] = new Student("Shubham", 95);
    students[2] = new Student("Abhi", 99);
    students[3] = new Student("Pradnya", 86);
        System.out.println("----------------Sorted by Marks------------------");
        System.out.println("-------------------------------------------------");

        linkedList.addAll(Arrays.asList(students));

    Comparator<Student> comparator=(student1,student2)->{
        if(student1.getMarks()==student2.getMarks())
            return 0;
        else if (student1.getMarks()<student2.getMarks()) {
            return -1;
        }else
            return 1;
    };
        for (Object student : linkedList) {
        System.out.println(student);
    }
    };
}
