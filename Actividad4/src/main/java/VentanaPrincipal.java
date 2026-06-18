package Excepciones;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JPanel {
    private JTextField txtNumerador;
    private JTextField txtDenominador;
    private JTextField txtResultado;

    public VentanaPrincipal() {
        // Establecer diseño de cuadrícula (3 filas, 2 columnas, espacios de 10px)
        setLayout(new GridLayout(3, 2, 10, 10));

        // Inicializar componentes
        txtNumerador = new JTextField();
        txtDenominador = new JTextField();
        txtResultado = new JTextField();
        txtResultado.setEditable(false); // Bloqueado para el usuario

        // Añadir componentes al panel
        add(new JLabel("Numerador:"));
        add(txtNumerador);
        add(new JLabel("Denominador:"));
        add(txtDenominador);
        add(new JLabel("Resultado:"));
        add(txtResultado);
    }

    // Métodos públicos para interactuar con la interfaz desde afuera
    public String getNumeradorTexto() {
        return txtNumerador.getText();
    }

    public String getDenominadorTexto() {
        return txtDenominador.getText();
    }

    public void setResultadoTexto(String resultado) {
        txtResultado.setText(resultado);
    }
}