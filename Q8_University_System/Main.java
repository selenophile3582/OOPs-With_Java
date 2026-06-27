
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Student s2 = new Student("Siddharth Aryan", 22, 105, 8.5);
        s2.displayInfo();
        System.out.println("Eligible for placements : " + s2.isEligibleForPlacement());
        System.out.println();

        Professor p1 = new Professor("Ashish Mit", 45, "Python", 8);
        p1.displayInfo();
        System.out.println("Is senior Professor : " + p1.isSeniorProfessor());
        System.out.println();

        Person p;

        p = new Student("Radha", 20, 101, 6.5);
        p.displayInfo();
        System.out.println();
        // System.out.println("Eligible for placements : " + p.isEligibleForPlacement()); // this method is not defined for person 

        p = new Professor("Sweta Mam", 40, "Web-Development", 11);
        p.displayInfo();
        System.out.println();

        //making an ArrayList of persons 
        ArrayList<Person> people = new ArrayList<Person>();
        // ArrayList<Person> people ;

        people.add(s2);
        people.add(p1);
        // people.add(p); // the last reference availble in p will get stored in the array list 

        System.out.println("Printing using array list ");
        for (Person peo : people) {
            peo.displayInfo();
            System.out.println();
        }

        try {
            Student s1 = new Student("Siddharth Aryan", -22, 105, 10.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
