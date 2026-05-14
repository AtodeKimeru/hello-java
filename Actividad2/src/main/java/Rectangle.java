public class Rectangle {
    private double base;
    private double altura;

    public Rectangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double perimeter() {
        return 2 * (base + altura);
    }

    public double area() {
        return base * altura;
    }
}
