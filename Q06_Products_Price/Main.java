
public class Main {

    public static void main(String[] args) {

        Product a = new Product();

        a.setName("Laptop");
        a.setPrice(55000);

        System.out.println(a.getName());
        System.out.println(a.getPrice());

        a.displayProduct();

        //second object
        Product b = new Product();

        b.setName("MacBookAir");
        b.setPrice(99000);

        System.out.println(b.getName());
        System.out.println(b.getPrice());

        b.displayProduct();

    }

}
