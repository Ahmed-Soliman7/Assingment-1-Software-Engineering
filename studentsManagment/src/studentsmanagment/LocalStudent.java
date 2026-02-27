package studentsmanagment;


public class LocalStudent extends Student {
    private String nationalID;
    
    
    public LocalStudent() {
        nationalID = "Null";
    }
    
    public LocalStudent(String n, int i, int a, String national) {
        super(n, i, a);
        nationalID = national;
    }
    
    public String getNationalID() {
        return nationalID;
    }
    
    public void setNationalID(String s) {
        nationalID = s;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student National ID " + nationalID);
    }
    
}
