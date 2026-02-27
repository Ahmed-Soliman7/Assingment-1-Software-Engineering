package studentsmanagment;

public class Enrollment {
    private Course course;
    private double grade;

    
    public Enrollment(Course c, double g) {
        course = c;
        grade = g;
    }
    
    public Course getCourse() {
        return course;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double g) {
        grade = g;
    }
}
