package StudentGradTracker;

public class Course {
    private String courseName;
    private double creditHours;
    private double grade;

    public Course(String courseName, double creditHours, double grade) {
        this.courseName = courseName;
        this.creditHours = creditHours;
        this.grade = grade;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getCreditHours() {
        return creditHours;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "{" +
                "courseName='" + courseName + '\'' +
                ", creditHours=" + creditHours +
                ", grade=" + grade +
                '}';
    }
}
