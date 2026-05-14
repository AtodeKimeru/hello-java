public class Triangle {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangle(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        
        if (lado1 == lado2) {
            // Equilateral: all sides equal
            this.lado3 = lado1;
        } else if (lado1 > lado2) {
            // Isosceles: two sides of lado1, one side of lado2
            this.lado3 = lado1;
        } else {
            // Scalene: right triangle with hypotenuse
            this.lado3 = Math.sqrt(lado1 * lado1 + lado2 * lado2);
        }
    }

    public String triangleType() {
        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilátero";
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
}
