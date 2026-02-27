package studentsmanagment;

public class ForeignStudent extends Student {
    private String country;
    private String passportNumber;
    
    
    public ForeignStudent() {
        country = "Null";
        passportNumber = "Null";
    }
    
    public ForeignStudent(String n, int i, int a, String c, String p) {
        super(n, i, a);
        country = c;
        passportNumber = p;
    }
    
    public String getCountry() {
        return country;
    }
    public String getPassportNumber() {
        return passportNumber;
    }
    
    public void setCountry(String s) {
        country = s;
    }
    
    public void setPassportNumber(String s) {
        passportNumber = s;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student Country : " + country);
        System.out.println("Student Passport Number : " + passportNumber);
    }
}
