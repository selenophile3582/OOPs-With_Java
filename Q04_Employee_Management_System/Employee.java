
public class Employee {

    private String name;
    private int id;
    private double salary;

    // Default constructor 
    public Employee() {
        this.name = "Unknown";
        this.id = 0;
        this.salary = 0.0;
    }

    // Parameterized Constructor 
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;

        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative");
            this.salary = 0;
        }
    }

    // Methods to show details 
    public void displayInfo() {

        System.out.println("Name   : " + name);
        System.out.println("Id     : " + id);
        System.out.println("Salary : " + salary);
        System.out.println();
    }

}
