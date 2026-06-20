
public class Student {

    private String name;
    private int rollNo;
    private double cgpa;

    public Student(String name, int rollNO, double cgpa) {
        this.name = name;
        this.rollNo = rollNO;
        if (cgpa >= 0.0 && cgpa <= 10.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA. Setting to 0.0");
            this.cgpa = 0.0;
        }
    }

    //non paramaterised constructor 
    // public Student() {
    // }
    public void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Roll No. : " + rollNo);
        System.out.println("CGPA : " + cgpa);
    }
}
