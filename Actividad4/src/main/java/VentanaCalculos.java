package Excepciones;

import javax.swing.*;
import java.awt.*;

public class VentanaCalculos extends JPanel {
    private JTextField txtValor;
    private JTextField txtLogaritmo;
    private JTextField txtRaiz;

    public VentanaCalculos() {
        // Cuadrícula de 3 filas, 2 columnas con espacio de 10 píxeles
        setLayout(new GridLayout(3, 2, 10, 10));

        // Inicializar componentes
        txtValor = new JTextField();
        txtLogaritmo = new JTextField();
        txtRaiz = new JTextField();

        // Bloquear campos de resultados para que el usuario no escriba ahí
        txtLogaritmo.setEditable(false);
        txtRaiz.setEditable(false);

        // Añadir elementos a la interfaz
        add(new JLabel("Ingresar Valor Numérico:"));
        add(txtValor);
        add(new JLabel("Logaritmo Neperiano:"));
        add(txtLogaritmo);
        add(new JLabel("Raíz Cuadrada:"));
        add(txtRaiz);
    }

    // Métodos para interactuar con el exterior
    public String getValorTexto() {
        return txtValor.getText().trim();
    }

    public void setLogaritmoTexto(String resultado) {
        txtLogaritmo.setText(resultado);
    }

    public void setRaizTexto(String resultado) {
        txtRaiz.setText(resultado);
    }
}