package Excepciones;

import javax.swing.JOptionPane;

public class EjercicioNo3 {
    public static void main(String[] args) {
        try {
            VentanaCalculos formulario = new VentanaCalculos();

            int opcion = JOptionPane.showConfirmDialog(null, formulario,
                    "Cálculos Numéricos Avanzados", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

            if (opcion != JOptionPane.OK_OPTION) {
                JOptionPane.showMessageDialog(null, "Operación cancelada por el usuario.");
                return;
            }

            String input = formulario.getValorTexto();
            if (input.isEmpty()) {
                throw new NumberFormatException("El campo no puede estar vacío.");
            }

            double valorNumérico = Double.parseDouble(input);

            // --- AQUÍ EMPIEZA LA ACUMULACIÓN DE ERRORES ---
            StringBuilder erroresAcumulados = new StringBuilder();
            boolean hayErrores = false;

            // 1. Intentar el cálculo del Logaritmo
            try {
                double resultadoLog = CalculosNumericos.calcularLogaritmoNeperiano(valorNumérico);
                formulario.setLogaritmoTexto(String.valueOf(resultadoLog));
            } catch (ArithmeticException e) {
                erroresAcumulados.append("• Logaritmo: ").append(e.getMessage()).append("\n");
                formulario.setLogaritmoTexto("Error");
                hayErrores = true;
            }

            // 2. Intentar el cálculo de la Raíz Cuadrada (ahora SÍ se ejecuta aunque el de
            // arriba falle)
            try {
                double resultadoRaiz = CalculosNumericos.calcularRaizCuadrada(valorNumérico);
                formulario.setRaizTexto(String.valueOf(resultadoRaiz));
            } catch (ArithmeticException e) {
                erroresAcumulados.append("• Raíz Cuadrada: ").append(e.getMessage()).append("\n");
                formulario.setRaizTexto("Error");
                hayErrores = true;
            }

            // 3. Evaluar el veredicto final
            if (hayErrores) {
                // Si hubo errores (ej: número negativo), lanzamos una excepción combinada
                throw new ArithmeticException(erroresAcumulados.toString());
            }

            // Si no hubo errores, mostramos la ventana llena con éxito
            JOptionPane.showMessageDialog(null, formulario, "Resultados Calculados", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: El valor ingresado debe ser numérico.",
                    "Error de Formato", JOptionPane.ERROR_MESSAGE);

        } catch (ArithmeticException e) {
            // Aquí se atrapa el String acumulado con las dos alertas juntas
            JOptionPane.showMessageDialog(null,
                    "Se presentaron los siguientes errores matemáticos:\n\n" + e.getMessage(),
                    "Multiples Errores Detectados", JOptionPane.WARNING_MESSAGE);
        }
    }
}