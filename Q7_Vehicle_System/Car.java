
public class Car extends Vehicle {

    private String model;

    public Car() {
        super();
        this.model = "";
    }

    public Car(String brand, double speed, String model) {
        super(brand, speed);
        this.model = model;
    }

    public void openSunroof() {
        System.out.println("Opening Sunroof... for " + this.model);
    }

    public void showSpecs() {
        System.out.println("Brand : " + this.brand);
        System.out.println("Speed : " + this.speed);
        System.out.println("Model : " +this.model);

    }
}
