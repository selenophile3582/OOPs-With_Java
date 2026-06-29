
public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says Meow Meow");
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
