package studentsmanagment;
import java.util.Scanner;
public class StudentsManagment {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Hello in student management software : ");
       System.out.println("Made by Youssef Mahrous");
       while (true) {
           int choice;
           System.out.println("1 - Add a student");
           System.out.println("2 - Remove a student");
           System.out.println("3 - Update a student");
           System.out.println("4 - Find a student by ID");
           System.out.println("5 - Find a student by name");
           System.out.println("6 - Display all students");
           System.out.println("7 - Add a course to a student");
           System.out.println("8 - Display student courses and GPA");
           System.out.println("0 - Exit");
           System.out.println("Please choose from the previous");
           choice = input.nextInt();
           input.nextLine();
           
           switch (choice) {
               case 0 :
                   System.exit(0);
                   break;
               case 1 :                 
                   System.out.print("Enter Name: ");
                   String name = input.nextLine();
                   System.out.print("Enter ID: ");
                   int id = input.nextInt();
                   System.out.print("Enter Age: ");
                   int age = input.nextInt();
                   input.nextLine();
                   System.out.println("1 - Local Student");
                   System.out.println("2 - Foreign Student");  
                   System.out.print("Enter type: ");
                   int type = input.nextInt();
                   input.nextLine();
                   switch (type) {
                       case 1 :
                            System.out.print("Enter National ID: ");
                            String nationalID = input.nextLine();
                            StudentManager.addStudent(new LocalStudent(name, id, age, nationalID));
                            System.out.println("A local student added successfully!");
                            break;
                       case 2 :
                            System.out.print("Enter Country: ");
                            String country = input.nextLine();
                            System.out.print("Enter Passport Number: ");
                            String passport = input.nextLine();
                            StudentManager.addStudent(new ForeignStudent(name, id, age, country, passport));
                            System.out.println("A foreign Student added successfully!");
                            break;
                       default :
                            System.out.println("Invalid choice, please try again!");
                   }
                   break;
               case 2 :
                    System.out.print("Enter Student ID to remove: ");
                    int removeID = input.nextInt();
                    input.nextLine();
                    StudentManager.removeStudent(removeID);
                    break;
               case 3 :
                    System.out.print("Enter Student ID to update: ");
                    int updateID = input.nextInt();
                    input.nextLine();
                    StudentManager.updateStudent(updateID);
                    break;
                case 4:
                    System.out.print("Enter Student ID to find: ");
                    int findID = input.nextInt();
                    input.nextLine();
                    Student s1 = StudentManager.findByID(findID);
                    if (s1 != null) s1.displayInfo();
                    break;
                case 5:
                    System.out.print("Enter Student Name to find: ");
                    String findName = input.nextLine();
                    Student s2 = StudentManager.findByName(findName);
                    if (s2 != null) s2.displayInfo();
                    break;  
                case 6:
                    StudentManager.displayAll();
                    break;
                case 7 :
                    System.out.print("Enter Student ID to add course: ");
                    int courseStudentID = input.nextInt();
                    StudentManager.addCourseToStudent(courseStudentID);
                    break;
                case 8 :
                    System.out.print("Enter Student ID to display courses and GPA: ");
                    int courseID = input.nextInt();
                    StudentManager.displayStudentCourses(courseID);
                    break;
                default:
                    System.out.println("Invalid choice, please try again!");
           }
       }
    }
}