package Excepciones;

import javax.swing.JOptionPane;

public class EjercicioNo2 {
    public static void main(String[] args) {
        try {
            // 1. Instanciamos la interfaz de ventana única
            VentanaVendedor formulario = new VentanaVendedor();

            // 2. Desplegamos el formulario integrado
            int opcion = JOptionPane.showConfirmDialog(null, formulario,
                    "Registro de Nuevo Vendedor", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

            // Manejo por si cancelan el formulario
            if (opcion != JOptionPane.OK_OPTION) {
                JOptionPane.showMessageDialog(null, "Registro cancelado por el usuario.");
                return;
            }

            // 3. Capturar datos de la ventana
            String nombreInput = formulario.getNombre();
            String apellidosInput = formulario.getApellidos();
            String edadInput = formulario.getEdadTexto();

            // Validar que no se envíen campos de texto vacíos
            if (nombreInput.isEmpty() || apellidosInput.isEmpty() || edadInput.isEmpty()) {
                throw new IllegalArgumentException("Todos los campos son obligatorios.");
            }

            // 4. Intentar transformar y evaluar la lógica del negocio
            int edadNumerica = Integer.parseInt(edadInput);

            // Creamos la instancia básica
            Vendedor vendedor = new Vendedor(nombreInput, apellidosInput);

            // Validamos la edad (aquí puede saltar a los bloques catch)
            vendedor.verificarEdad(edadNumerica);

            // 5. Si todo es correcto, imprimimos en la interfaz la tarjeta del vendedor
            vendedor.imprimir();

        } catch (NumberFormatException e) {
            // Atrapa entradas que no sean enteros en la edad (ej: "veinte", "18.5", letras)
            JOptionPane.showMessageDialog(null, "Error: La edad debe ser un número entero válido.",
                    "Error de Formato", JOptionPane.ERROR_MESSAGE);

        } catch (IllegalArgumentException e) {
            // Atrapa los mensajes personalizados configurados en verificarEdad()
            JOptionPane.showMessageDialog(null, "Error de Validación:\n" + e.getMessage(),
                    "Argumento Inválido", JOptionPane.WARNING_MESSAGE);
        }
    }
}
