
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says Bark Bark");
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
