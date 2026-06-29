
public class Animal {

    private String name;

    public Animal(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println("Making sound ");
    }

    public void eat() {
        System.out.println("Animal is eating....");
    }

    public void sleep() {
        System.out.println("Animal is sleeping...");
    }
}
