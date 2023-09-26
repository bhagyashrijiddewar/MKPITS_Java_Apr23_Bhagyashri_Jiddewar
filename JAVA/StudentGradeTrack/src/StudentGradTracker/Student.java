package StudentGradTracker;
import java.util.LinkedList;

public class Student {
   private String name;

   private LinkedList<Course> courses;

   public Student(String name, LinkedList<Course> courses) {
      this.name = name;
      this.courses = courses;
   }

   public String getName() {
      return name;
   }

   public LinkedList<Course> getCourses() {
      return courses;
   }

   @Override
   public String toString() {
      return "Student name :{" +
              "name='" + name + '\'' +
              ", courses=" + courses +
              '}';
   }
}
