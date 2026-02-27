package studentsmanagment;


import java.util.ArrayList;
import java.util.Scanner;


public class StudentManager {
    private static ArrayList<Student> students = new ArrayList<Student>(); 
    private static Scanner input = new Scanner(System.in);
    
    public static void addStudent(Student s) {
        students.add(s);
    }
    
    public static void removeStudent(int id) {
        boolean find = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getID() == id) {
                students.remove(i);
                System.out.println("Student has been removed!");
                find = true;
                break;
            }
        }
        if (find == false) {
            System.out.println("There is no student with this ID");
        }
    }
    
    public static void updateStudent(int id) {
        boolean find = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getID() == id) {
                System.out.print("Please enter new name: ");
                String newName = input.nextLine();
                System.out.print("Please enter new age: ");
                int newAge = input.nextInt();
                input.nextLine();
                students.get(i).setName(newName);
                students.get(i).setAge(newAge);
                if (students.get(i) instanceof LocalStudent) {
                    System.out.print("Please enter new National ID: ");
                    String newNationalID = input.nextLine();
                    ((LocalStudent)students.get(i)).setNationalID(newNationalID);
                } else if (students.get(i) instanceof ForeignStudent) {
                    System.out.print("Please enter new Country: ");
                    String newCountry = input.nextLine();
                    ((ForeignStudent)students.get(i)).setCountry(newCountry);
                    System.out.print("Please enter new Passport Number: ");
                    String newPassportNumber = input.nextLine();
                    ((ForeignStudent)students.get(i)).setPassportNumber(newPassportNumber);
                }
                System.out.println("Student updated successfully!");
                find = true;
                break;
            }
        }
        if (find == false) {
           System.out.println("There is no student with this ID");
        }
    }
    
    public static Student findByID(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getID() == id) {
                return students.get(i);
            }
        }
        System.out.println("There is no student with this ID");
        return null;
    }
    
    public static Student findByName(String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                return students.get(i);
            }
        }
        System.out.println("There is no student with this name");
        return null;
    }
    
    public static void addCourseToStudent(int id) {
        Student stud = StudentManager.findByID(id);
        if (stud != null) {
            System.out.print("Enter Course Code: ");
            String code = input.nextLine();
            System.out.print("Enter Course Name: ");
            String name = input.nextLine();
            System.out.print("Enter Credit Hours: ");
            int credits = input.nextInt();
            input.nextLine();
            System.out.print("Enter Grade: ");
            double grade = input.nextDouble();
            input.nextLine();
            Course course = new Course(code, name, credits);
            Enrollment enrollment = new Enrollment(course, grade);
            stud.addEnrollment(enrollment);
            System.out.println("Course added successfully!");
        }
    }
    
    public static void displayStudentCourses(int id) {
        Student s = findByID(id);
        if (s == null) return;
        
        if (s.getEnrollments().isEmpty()) {
            System.out.println("No courses found to this student!");
            return;
        } else {
            System.out.println("Courses for: " + s.getName());
            System.out.println("#".repeat(50));
            for (Enrollment e : s.getEnrollments()) {
                System.out.println(e.getCourse().toString());
                System.out.printf("Grade: %.1f%n", e.getGrade());
                System.out.println("#".repeat(30));
            }
            System.out.printf("GPA: %.2f%n", s.getGPA());
        }
    }
    
    public static void displayAll() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }
        for (int i = 0; i < students.size(); i++) {
            System.out.printf("Student number %d%n", (i+1));
            System.out.println("Student Name : " + students.get(i).getName());
            System.out.printf("Student ID: %d%n", students.get(i).getID());
            System.out.printf("Student Age : %d%n", students.get(i).getAge());
            if (students.get(i) instanceof LocalStudent) {
                System.out.println("Student National ID : " + ((LocalStudent)students.get(i)).getNationalID());
            } else if (students.get(i) instanceof ForeignStudent) {
                System.out.println("Student Country : " + ((ForeignStudent)students.get(i)).getCountry());
                System.out.println("Student Passport Number : " + ((ForeignStudent)students.get(i)).getPassportNumber());
            }
            System.out.println("#".repeat(50));
        }
    }
}