
public class Main {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();

        v1.brand = "Tesla";
        v1.speed = 105.5;
        v1.start();

        Car c1 = new Car();
        c1.brand = "Mahindra";
        c1.speed = 100;
        // c1.model = "Xuv700";
        c1.start();
        c1.openSunroof();
        c1.showSpecs();
        
        Car c2 = new Car("Hunndai", 55, "Auto700");
        c2.start();
        c2.openSunroof();
        c2.showSpecs();


    }

}
