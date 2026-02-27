package studentsmanagment;

import java.util.ArrayList;

public abstract class Student {
    private String name;
    private int ID;
    private int age;
    private ArrayList<Enrollment> enrollments = new ArrayList<Enrollment>(); 
    
    public Student() {
        name = "Null";
        ID = 0;
        age = 0;
    }
    
    public Student(String n, int i, int a) {
        name = n;
        ID = i;
        age = a;
    }
    
    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    
    public void setID(int i) {
        ID = i;
    }
    public void setAge(int a) {
        age = a;
    }
    public void setName(String s) {
        name = s;
    }
    
    private double gradeToPoints(double grade) {
        if (grade >= 90) return 4.0;
        else if (grade >= 80) return 3.0;
        else if (grade >= 70) return 2.0;
        else if (grade >= 60) return 1.0;
        else return 0.0;
    }

    public double getGPA() {
        double totalPoints = 0;
        int totalCredits = 0;

        for (Enrollment e : enrollments) {
            double points = gradeToPoints(e.getGrade());
            int credits = e.getCourse().getCreditHours();

            totalPoints += points * credits;
            totalCredits += credits;
        }

        if (totalCredits == 0) return 0.0;

        return totalPoints / totalCredits;
    }

    public void addEnrollment(Enrollment e) {
        enrollments.add(e);
    }
    
    public ArrayList<Enrollment> getEnrollments() {
        return enrollments;
    }
    
    public void displayInfo() {
        System.out.println("Student name : " + name);
        System.out.printf("Student ID : %d", ID);
        System.out.println();
        System.out.printf("Student Age : %d", age);
        System.out.println();
    }

}
