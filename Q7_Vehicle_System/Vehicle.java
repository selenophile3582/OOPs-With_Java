
public class Vehicle {

    protected String brand;
    protected double speed;
    

    public Vehicle() {
        this.brand = "Unknown";
        this.speed = 0.0;
    }

    public Vehicle(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void start() {
        System.out.println("Starting....");
    }

}
