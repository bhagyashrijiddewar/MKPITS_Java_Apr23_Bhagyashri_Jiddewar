import StudentGradTracker.Course;

public class GradeClass {
    private int score;
    private Course course;

    public GradeClass(int score, Course course) {
        this.score = score;
        this.course = course;
    }

    public int getScore() {
        return score;
    }

    public Course getCourse() {
        return course;
    }
}
