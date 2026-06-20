
public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Siddharth Aryan", 15, 7.95);
        // manually making using default constructor 
        // s1.name = "Siddharth Aryan";
        // s1.rollNo = 005;
        // s1.cgpa = 7.95;
        // System.out.println(s1.name);
        // System.out.println(s1.rollNo);
        // System.out.println(s1.cgpa);
        //printing using user defined function
        s1.displayInfo();
        //Creating new student using paramatered consturctor ;
        Student s2 = new Student("Kishan kumar ", 20, 7.5);
        s2.displayInfo();

        // Teachers 
        Teacher t1 = new Teacher("Mukesh ", 111, 12345);
        // System.out.println(t1.name);
        t1.displayInfo();

        // investors 
        Investor i1 = new Investor();

        i1.setName("Mukesh Ambani");
        i1.setInvestment(987654321);
        i1.displayInvInfo();

    }
}
