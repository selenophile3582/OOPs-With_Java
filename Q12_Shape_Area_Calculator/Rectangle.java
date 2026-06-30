
public class Rectangle extends Shape {

    private double l;
    private double b;

    public Rectangle(double l, double b) {
        if (l < 0) {
            System.out.println("Length cannot be less than 0 , setting length to 0");
            this.l = 0;
        } else {
            this.l = l;
        }
        if (b < 0) {
            System.out.println("Width cannot be less than 0, setting b = 0 ");
            this.b = 0;
        } else {
            this.b = b;
        }
    }

    @Override
    public double calculateArea() {
        // System.out.printf("Area of rectangle with dimesions ( %.2f %.2f ) :", l , b );
        return l * b;
    }
}
