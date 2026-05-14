public class Circle {
    private double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    public double perimeter() {
        return 2 * Math.PI * radio;
    }

    public double area() {
        return Math.PI * radio * radio;
    }
}
