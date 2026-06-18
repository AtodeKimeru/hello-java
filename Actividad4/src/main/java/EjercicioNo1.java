package Excepciones;

import javax.swing.JOptionPane;

public class EjercicioNo1 {
    /*
     * Ejercicio No. 1 Actividad 4 Página 400:
     * Manejo de Excepciones con Try-Catch-Finally & Interfaz Gráfica
     */
    public static void main(String args[]) {

        // --- PRIMER BLOQUE TRY ---
        try {
            JOptionPane.showMessageDialog(null, "Ingresando al primer try",
                    "Bloque 1", JOptionPane.INFORMATION_MESSAGE);

            // Instanciamos nuestra interfaz gráfica personalizada
            VentanaPrincipal formulario = new VentanaPrincipal();

            // Mostramos la ventana pasando el panel directamente
            int opcion = JOptionPane.showConfirmDialog(null, formulario,
                    "Formulario de División - Bloque 1", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

            // Control por si el usuario presiona "Cancelar" o cierra la ventana
            if (opcion != JOptionPane.OK_OPTION) {
                JOptionPane.showMessageDialog(null, "Operación cancelada por el usuario.");
                throw new RuntimeException("Flujo interrumpido");
            }

            // Convertimos las entradas llamando a los métodos de nuestra VentanaPrincipal
            double numerador = Double.parseDouble(formulario.getNumeradorTexto());
            double denominador = Double.parseDouble(formulario.getDenominadorTexto());

            // Evaluamos manualmente antes de que Java devuelva "Infinity" o "NaN"
            if (denominador == 0) {
                throw new ArithmeticException("División por cero");
            }

            double cociente = numerador / denominador;

            // Enviamos la respuesta de regreso al campo de texto de la interfaz
            formulario.setResultadoTexto(String.valueOf(cociente));

            /* Mostramos la confirmación final del Bloque 1 con el panel lleno */
            JOptionPane.showMessageDialog(null, formulario, "Resultado Calculado Exitosamente",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (ArithmeticException e) {
            /* Se captura la excepción simulada cuando el usuario ingresa 0 */
            JOptionPane.showMessageDialog(null, "División por cero",
                    "Error Bloque 1", JOptionPane.ERROR_MESSAGE);

        } catch (NumberFormatException e) {
            /* Manejo adicional por si ingresan letras o dejan vacío */
            JOptionPane.showMessageDialog(null, "Error: Por favor ingrese números válidos.",
                    "Input Error", JOptionPane.ERROR_MESSAGE);

        } catch (Exception e) {
            System.out.println("Salto controlado: " + e.getMessage());

        } finally {
            /* La sentencia finally siempre se ejecuta */
            JOptionPane.showMessageDialog(null, "Ingresando al primer finally",
                    "Finally 1", JOptionPane.WARNING_MESSAGE);
        }

        // --- SEGUNDO BLOQUE TRY ---
        try {
            JOptionPane.showMessageDialog(null, "Ingresando al segundo try",
                    "Bloque 2", JOptionPane.INFORMATION_MESSAGE);

            // Instanciamos nuestra interfaz gráfica personalizada
            VentanaPrincipal formulario = new VentanaPrincipal();

            // Mostramos la ventana pasando el panel directamente
            int opcion = JOptionPane.showConfirmDialog(null, formulario,
                    "Formulario de División - Bloque 1", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

            // Control por si el usuario presiona "Cancelar" o cierra la ventana
            if (opcion != JOptionPane.OK_OPTION) {
                JOptionPane.showMessageDialog(null, "Operación cancelada por el usuario.");
                throw new RuntimeException("Flujo interrumpido");
            }

            // Convertimos las entradas llamando a los métodos de nuestra VentanaPrincipal
            double numerador = Double.parseDouble(formulario.getNumeradorTexto());
            double denominador = Double.parseDouble(formulario.getDenominadorTexto());

            // Evaluamos manualmente antes de que Java devuelva "Infinity" o "NaN"
            if (denominador == 0) {
                throw new ArithmeticException("División por cero");
            }

            double cociente = numerador / denominador;

            // Enviamos la respuesta de regreso al campo de texto de la interfaz
            formulario.setResultadoTexto(String.valueOf(cociente));

            Object objeto = null;
            objeto.toString(); // Se lanza un NullPointerException automáticamente

            /* Esta instrucción nunca será ejecutada */
            JOptionPane.showMessageDialog(null, "Imprimiendo objeto");

        } catch (ArithmeticException e) {
            /* La excepción lanzada NO es de este tipo, así que se la salta */
            JOptionPane.showMessageDialog(null, "División por cero");

        } catch (Exception e) {
            /*
             * Se captura cualquier otra excepción general aquí (como NullPointerException)
             */
            JOptionPane.showMessageDialog(null, "Ocurrió una excepción: " + e.getClass().getSimpleName(),
                    "Error Bloque 2", JOptionPane.ERROR_MESSAGE);

        } finally {
            /* La sentencia finally siempre se ejecuta */
            JOptionPane.showMessageDialog(null, "Ingresando al segundo finally",
                    "Finally 2", JOptionPane.WARNING_MESSAGE);
        }
    }
}