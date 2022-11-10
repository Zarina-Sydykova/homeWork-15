import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circle.circumference();
        Circle circle = new Circle(Math.PI, (int) scanner.nextDouble());
        Circle.area();
        System.out.println("Area of circle: "+Circle.area());
        System.out.println("Circumference: "+Circle.circumference());
    }
}