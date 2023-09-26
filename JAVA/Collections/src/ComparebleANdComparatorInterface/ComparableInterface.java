package ComparebleANdComparatorInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class ComparableInterface {
   public static void main(String[] args) {
       LinkedList<Student> linkedList=new LinkedList<Student>();
       Student[] students = new Student[4];
       students[0]=new Student("Pranay",90);
       students[1]=new Student("Shubham",95);
       students[2]=new Student("Abhi",99);
       students[3]=new Student("Pradnya",86);
       System.out.println("----------------Sorted by Marks------------------");
       System.out.println("-------------------------------------------------");

       linkedList.addAll(Arrays.asList(students));

       Collections.sort(linkedList);
       System.out.println(linkedList);

//       for(Object student:linkedList){
//           System.out.println(student);
//       }
   }
}
