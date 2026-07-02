
public class Student extends Person {

    private int rollNo;
    private double cgpa;

    public Student(String name, int age, int rollNo, double cgpa) {
        super(name, age);

        //checking roll No 
        if (rollNo < 0) {
            throw new IllegalArgumentException("Roll no. cannot be negative ");
        } else {
            this.rollNo = rollNo;
        }

        //checking cgpa 
        if (cgpa < 0 || cgpa > 10) {
            throw new IllegalArgumentException("CGPA cannot be negative ");
        } else {
            this.cgpa = cgpa;
        }
    }

    public boolean isEligibleForPlacement() {
        return cgpa >= 7.0;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Roll No : " + this.rollNo);
        System.out.println("CGPA : " + cgpa);
        // System.out.println();
    }
}
