
public class Main {

    public static void main(String[] args) {
        Shape[] shapes = {new Circle(7.0), new Rectangle(20, 5), new Triangle(10, 10),
            new Circle(14.0), new Rectangle(5, 5), new Triangle(8, 10), new Triangle(-5, 3)
        };

        for (Shape myShape : shapes) {
            double area = myShape.calculateArea();

            System.out.println(myShape.getClass().getSimpleName() + " area : " + area);
            System.out.println();
        }

    }
}
