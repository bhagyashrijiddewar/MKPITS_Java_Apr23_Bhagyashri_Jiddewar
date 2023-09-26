package ComparebleANdComparatorInterface;

import java.util.Comparator;

public class StudentNameClass implements Comparator<StudentComparator> {
    @Override
    public int compare(StudentComparator student1, StudentComparator student2) {
//   ---------------------First method to sort the string collection----------------
//        return student1.getName().compareTo(student2.getName());

//   -------------------Second method to sort the string collection---------------
        if(student1.getName()==student2.getName())
            return 0;
        else if (student1.getName().compareTo(student2.getName())<0) {
            return -1;
        }else
            return 1;
    }
}
