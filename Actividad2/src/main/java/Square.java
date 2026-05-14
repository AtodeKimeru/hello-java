public class Square {
    private double lado;

    public Square(double lado) {
        this.lado = lado;
    }

    public double perimeter() {
        return 4 * lado;
    }

    public double area() {
        return lado * lado;
    }
}
