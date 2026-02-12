import java.util.Scanner;

public class EjercicioNo14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int number = scanner.nextInt();

        EjercicioNo14 testNumber = new EjercicioNo14(number);
        System.out.println("El cuadrado de " + number + " es: " + testNumber.square());
        System.out.println("El cubo de " + number + " es: " + testNumber.cube());
    }

    private int number;

    public EjercicioNo14(int number) {
        this.number = number;
    }

    public int square() {
        return number * number;
    }

    public int cube() {
        return number * number * number;
    }
}
