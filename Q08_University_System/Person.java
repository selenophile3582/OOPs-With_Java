
public class Person {

    protected String name;
    protected int age;

    public Person(String name, int age) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty ");
        } else {
            this.name = name;
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative ");
        } else {
            this.age = age;
        }

        
    }

    public void displayInfo() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        // System.out.println();
    }

}
