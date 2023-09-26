package DynamicStudentGradeTracker;
import java.util.LinkedList;

public class Student {
    private String name;

    private LinkedList<CourseClass> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new LinkedList<CourseClass>();
    }

    public String getName() {
        return name;
    }

    public void addCourse(CourseClass courseClass){
        courses.add(courseClass);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }
}
