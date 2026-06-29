
public class Main {

    public static void main(String[] args) {

        // Animal a = new Dog("Dogesh bhai");
        // Animal b = new Cat("Kitti");
        // Animal c = new Cow("Cowww");
        // // Animal d = new Animal();
        // a.makeSound(); //dog
        // b.makeSound(); //cat
        // c.makeSound(); //cow
        // d.makeSound(); //animal 
        
        Animal[] animals = {new Dog("Tommy"), new Cat("Kittu"), new Cow("calf")};

        for (Animal ani : animals) {
            ani.makeSound();
            ani.eat();
            ani.sleep();
            System.out.println("----------");
        }
    }
}
