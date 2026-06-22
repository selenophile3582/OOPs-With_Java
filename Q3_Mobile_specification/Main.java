
public class Main {

    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung", 99000, 32);

        m1.displayInfo();

        Mobile m2 = new Mobile("Apple", 100999, -5);
        m2.displayInfo();

        Mobile m3 = new Mobile("Apple", 100999, 16);
        m3.displayInfo();
    }
}
