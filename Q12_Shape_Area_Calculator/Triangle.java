
public class Triangle extends Shape {

    private double h;
    private double b;

    public Triangle(double base, double height) {

        if (height < 0) {
            System.out.println("Height cannot be less than 0 , setting Height to 0");
            this.h = 0;
        } else {
            this.h = height;
        }
        if (base < 0) {
            System.out.println("Base cannot be less than 0, setting b = 0 ");
            this.b = 0;
        } else {
            this.b = base;
        }

    }

    @Override
    public double calculateArea() {
        // System.out.printf("Area of triangle with h = %.2f and b = %.2f is : ", h, b);
        return 0.5 * h * b;
    }

}
