public class Circle {
    private double PI;
    private static int a;

    public Circle(double pi, int a) {
        PI = pi;
        this.a = a;

    }
    public static double area(){
        double v = Math.PI * (a * a);
        return v;
    }
    public static double circumference(){
        double v = Math.PI * 2 * a;
        return v;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "PI=" + PI +
                '}';
    }
}
