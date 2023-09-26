package ComparebleANdComparatorInterface.StudentListSortingByAnonimousClass;

import ComparebleANdComparatorInterface.StudentComparator;
import ComparebleANdComparatorInterface.StudentMarksClass;
import ComparebleANdComparatorInterface.StudentNameClass;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class ComparatorInterfaceMain {
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

        Collections.sort(linkedList, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                if (student1.getMarks() == student2.getMarks()) {
                    return 0;
                } else if (student1.getMarks() < student2.getMarks()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        for (Object student : linkedList) {
            System.out.println(student);
        }

        System.out.println("----------------Sorted by Name------------------");
        System.out.println("------------------------------------------------");

        Collections.sort(linkedList, new Comparator<Student>()
        {
            @Override
            public int compare(Student student1, Student student2) {
                //   ---------------------First method to sort the string collection-----(use any one)-----------
//        return student1.getName().compareTo(student2.getName());

//   -------------------Second method to sort the string collection-------(use any one)--------
                if(student1.getName()==student2.getName())
                    return 0;
                else if (student1.getName().compareTo(student2.getName())<0) {
                    return -1;
                }else
                    return 1;
            }
        });
        for (Object student : linkedList) {
            System.out.println(student);
        }
    }
}
