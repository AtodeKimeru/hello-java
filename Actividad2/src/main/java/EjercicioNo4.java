public class EjercicioNo4 {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Rectangle rectangle = new Rectangle(5, 3);
        Square square = new Square(4);
        RightTriangle rightTriangle = new RightTriangle(3, 4);

        System.out.println("=== Círculo (radio = 2) ===");
        System.out.println("Perímetro: " + circle.perimeter());
        System.out.println("Área: " + circle.area());

        System.out.println("\n=== Rectángulo (5 x 3) ===");
        System.out.println("Perímetro: " + rectangle.perimeter());
        System.out.println("Área: " + rectangle.area());

        System.out.println("\n=== Cuadrado (lado = 4) ===");
        System.out.println("Perímetro: " + square.perimeter());
        System.out.println("Área: " + square.area());

        System.out.println("\n=== Triángulo Rectángulo (3-4-5) ===");
        System.out.println("Perímetro: " + rightTriangle.perimeter());
        System.out.println("Área: " + rightTriangle.area());
        System.out.println("Hipotenusa: " + rightTriangle.hypotenuse());

        Triangle t1 = new Triangle(5, 5);
        Triangle t2 = new Triangle(5, 3);
        Triangle t3 = new Triangle(3, 4);

        System.out.println("\n=== Tipos de Triángulos ===");
        System.out.println("Triángulo (5, 5): " + t1.triangleType());
        System.out.println("Triángulo (5, 3): " + t2.triangleType());
        System.out.println("Triángulo (3, 4): " + t3.triangleType());
    }
}
