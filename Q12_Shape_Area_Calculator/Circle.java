
public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        if (radius < 0) {
            System.out.println("Radius cannot be less than 0, setting radius = 0 ");
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    @Override
    public double calculateArea() {
        // System.out.printf("Area of Circe with radius %.2f = ", radius);
        return Math.PI * radius * radius;
    }

}
