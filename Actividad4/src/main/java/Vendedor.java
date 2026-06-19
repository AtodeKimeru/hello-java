package Excepciones;

import javax.swing.JOptionPane;

public class Vendedor {
    String nombre;
    String apellidos;
    int edad;

    // Constructor
    public Vendedor(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    /**
     * Muestra de forma integrada los datos válidos del vendedor en un cuadro
     * gráfico.
     */
    void imprimir() {
        String mensaje = "=== Datos del Vendedor ===\n" +
                "• Nombre: " + nombre + "\n" +
                "• Apellidos: " + apellidos + "\n" +
                "• Edad: " + edad + " años";

        JOptionPane.showMessageDialog(null, mensaje, "Ficha del Vendedor", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Evalúa las reglas del negocio sobre la edad y arroja las excepciones
     * correspondientes.
     */
    void verificarEdad(int edad) throws IllegalArgumentException {
        // Regla 1: Validar límites biológicos lógicos primarios
        if (edad < 0 || edad > 120) {
            throw new IllegalArgumentException("La edad no puede ser negativa ni mayor a 120.");
        }
        // Regla 2: Validar mayoría de edad legal para laboral
        if (edad < 18) {
            throw new IllegalArgumentException("El vendedor debe ser mayor de 18 años.");
        }

        // Si pasa ambos filtros, se asigna
        this.edad = edad;
    }
}