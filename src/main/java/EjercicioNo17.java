import java.util.Scanner;

public class EjercicioNo17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");     
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Área del círculo: " + circle.area());
        System.out.println("Perímetro del círculo: " + circle.perimeter());
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
