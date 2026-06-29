
public class Cow extends Animal {

    public Cow(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says Moo Moo");

    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }
}
