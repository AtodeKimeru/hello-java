package Archivos;

import javax.swing.*;
import java.awt.*;

public class VentanaLeerArchivo extends JPanel {
    private JTextArea txtContenido;

    public VentanaLeerArchivo() {
        setLayout(new BorderLayout(10, 10));

        // Área de texto configurada para solo lectura
        txtContenido = new JTextArea(15, 40);
        txtContenido.setEditable(false);
        txtContenido.setFont(new Font("Monospaced", Font.PLAIN, 12));

        // Agregar barras de desplazamiento automáticas
        JScrollPane scroll = new JScrollPane(txtContenido);

        add(new JLabel("Contenido del archivo seleccionado:"), BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
    }

    // Método para inyectar el texto leído en la interfaz
    public void setContenido(String texto) {
        txtContenido.setText(texto);
    }
}