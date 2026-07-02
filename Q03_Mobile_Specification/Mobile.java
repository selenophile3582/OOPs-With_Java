
public class Mobile {

    private String brand;
    private double price;
    private int ram;

    public Mobile(String brand, double price, int ram) {

        if (brand == null || brand.isBlank()) {
            this.brand = "Unknown";
        } else {
            this.brand = brand;
        }
        if (price <= 0) {
            this.price = 0.0;
            System.out.println("Price must be greater than 0");
        } else {
            this.price = price;
        }

        if (ram <= 0) {
            this.ram = 0;
            System.out.println("RAM must be greater than 0");
        } else {
            this.ram = ram;
        }
    }

    public void displayInfo() {
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
        System.out.println("RAM   : " + ram + " GB");

    }

}
