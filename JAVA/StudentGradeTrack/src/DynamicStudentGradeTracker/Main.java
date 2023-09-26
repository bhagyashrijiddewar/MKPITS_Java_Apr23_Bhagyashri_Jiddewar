package DynamicStudentGradeTracker;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the student name : ");
        String studentName= scanner.nextLine();
        System.out.println("Enter number of courses : ");
        int courseCounter= scanner.nextInt();
        Student student=new Student(studentName);

        for (int number=0;number<courseCounter;number++){
            System.out.println("Enter course name : ");
           String courseName= scanner.nextLine();

            System.out.println("Enter credit hours : ");
            Double courseHours=scanner.nextDouble();

            System.out.println("Enter grade : ");
            Double courseGrade=scanner.nextDouble();
            CourseClass courseClass=new CourseClass(courseName,courseHours,courseGrade);
            student.addCourse(courseClass);
        }

        System.out.println(student);
    }
}
