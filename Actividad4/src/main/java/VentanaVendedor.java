package Excepciones;

import javax.swing.*;
import java.awt.*;

public class VentanaVendedor extends JPanel {
    private JTextField txtNombre;
    private JTextField txtApellidos;
    private JTextField txtEdad;

    public VentanaVendedor() {
        // Cuadrícula de 3 filas, 2 columnas con espacio de 10 píxeles
        setLayout(new GridLayout(3, 2, 10, 10));

        // Inicializar los cuadros de texto
        txtNombre = new JTextField();
        txtApellidos = new JTextField();
        txtEdad = new JTextField();

        // Ensamblar el panel único
        add(new JLabel("Nombre:"));
        add(txtNombre);
        add(new JLabel("Apellidos:"));
        add(txtApellidos);
        add(new JLabel("Edad:"));
        add(txtEdad);
    }

    // Métodos públicos para extraer la información ingresada por el usuario
    public String getNombre() {
        return txtNombre.getText().trim();
    }

    public String getApellidos() {
        return txtApellidos.getText().trim();
    }

    public String getEdadTexto() {
        return txtEdad.getText().trim();
    }
}
