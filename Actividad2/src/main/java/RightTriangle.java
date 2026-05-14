public class RightTriangle {
    private double base;
    private double altura;

    public RightTriangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double hypotenuse() {
        return Math.sqrt(base * base + altura * altura);
    }

    public double perimeter() {
        return base + altura + hypotenuse();
    }

    public double area() {
        return (base * altura) / 2;
    }
}
