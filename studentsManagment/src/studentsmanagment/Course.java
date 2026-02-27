package studentsmanagment;

public class Course {
    private String code;
    private String name;
    private int creditHours;
    
    
    public Course () {
        code = "Null";
        name = "Null";
        creditHours = 0;
    }
    
    public Course(String c, String n, int hours) {
        code = c;
        name = n;
        creditHours = hours;
    }
    
    public String toString() {
        return "Code : " + code + " | " + "Name : " + name + " | " + "Credit Hours : " + creditHours;
    }
    
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public int getCreditHours() {
        return creditHours;
    }
    public void setCode(String c) {
        code = c;
    }
    public void setName(String n) {
        name = n;
    }
    public void setCreditHours(int hours) {
        creditHours = hours;
    }
}
