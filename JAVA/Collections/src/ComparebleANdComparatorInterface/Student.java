package ComparebleANdComparatorInterface;

import java.io.Serializable;

public class Student implements Comparable<Student> {

        private String name;
        private int marks;

        public Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        public String getName() {
            return name;
        }

        public int getMarks() {
            return marks;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", marks=" + marks +
                    '}';
        }

//    @Override
//    public int compareTo(Student o) {
//        return this.getMarks()-o.getMarks();
//    }


    @Override
    public int compareTo(Student student) {
        if(marks==student.marks)
            return 0;
        else if (marks<student.marks) {
            return -1;
        }
        else {
            return 1;
        }
    }
}


