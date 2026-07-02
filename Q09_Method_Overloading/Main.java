
public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Adding two ints : " + calc.add(1, 2));
        System.out.println("Adding three ints : " + calc.add(1, 2, 3));
        System.out.println("Adding two doubles : " + calc.add(1.111111111111111111115, 2.111111111111111111115));
        System.out.println("Adding two floats : " + calc.add(1.111111111111111111115f, 2.111111111111111111115f));
    }

}
