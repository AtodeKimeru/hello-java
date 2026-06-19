package Excepciones;

public class CalculosNumericos {

    /**
     * Calcula el logaritmo neperiano de un número real.
     * 
     * @throws ArithmeticException si el valor es negativo.
     */
    public static double calcularLogaritmoNeperiano(double valor) throws ArithmeticException {
        if (valor <= 0) {
            throw new ArithmeticException("El valor debe ser un número positivo para calcular el logaritmo.");
        }
        return Math.log(valor);
    }

    /**
     * Calcula la raíz cuadrada de un número real.
     * 
     * @throws ArithmeticException si el valor es negativo.
     */
    public static double calcularRaizCuadrada(double valor) throws ArithmeticException {
        if (valor < 0) {
            throw new ArithmeticException(
                    "El valor debe ser cero o un número positivo para calcular la raíz cuadrada.");
        }
        return Math.sqrt(valor);
    }
}