


public class Product {

    private String name;
    private double price;


    //  Default Constructor 
    public Product(){}

    //Set Name 
    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        }
    }

    //Get Name 
    public String getName() {
        return this.name;
    }

    //Set Price 
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 0.0;
            System.out.println("price must be greater than 0");
        }
    }

    //Get Price 
    public double getPrice() {
        return this.price;
    }

    //display Product 
    public void displayProduct(){
        System.out.println("Product Name : "+this.name);
        System.out.println("Price        : "+this.price);
    }

}
