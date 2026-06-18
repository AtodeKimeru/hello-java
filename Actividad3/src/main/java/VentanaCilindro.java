package Figuras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCilindro extends JFrame implements ActionListener {

    private Container contenedor;

    private JLabel radio, altura, volumen, superficie;

    private JTextField campoRadio, campoAltura;

    private JButton calcular;

    public VentanaCilindro() {
        inicio();
        setTitle("Cilindro");
        setSize(280, 250);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        radio = new JLabel();
        radio.setText("Radio (cms):");
        radio.setBounds(20, 20, 135, 23); // Establece la posición de la etiqueta

        campoRadio = new JTextField();
        campoRadio.setBounds(100, 20, 135, 23); // Establece la posición de la etiqueta

        altura = new JLabel();
        altura.setText("Altura (cms):");
        altura.setBounds(20, 50, 135, 23); // Establece la posición de la etiqueta

        campoAltura = new JTextField();
        campoAltura.setBounds(100, 50, 135, 23);// Establece la posición de la etiqueta

        calcular = new JButton();
        calcular.setText("Calcular");
        calcular.setBounds(100, 80, 135, 23); // Establece la posición de la etiqueta
        calcular.addActionListener(this);

        volumen = new JLabel();
        volumen.setText("Volumen (cm3):");
        volumen.setBounds(20, 110, 135, 23);// Establece la posición de la etiqueta

        superficie = new JLabel();
        superficie.setText("Superficie (cm2):");
        superficie.setBounds(20, 140, 195, 23);// Establece la posición de la etiqueta

        contenedor.add(radio);
        contenedor.add(campoRadio);
        contenedor.add(altura);
        contenedor.add(campoAltura);
        contenedor.add(calcular);
        contenedor.add(volumen);
        contenedor.add(superficie);
    }

    public void actionPerformed(ActionEvent event) {

        double radio = 0;
        double altura = 0;
        try {
            // Se obtiene el radio del cilindro ingresado
            radio = Double.parseDouble(campoRadio.getText());
            // Se obtiene la altura del cilindro ingresada
            altura = Double.parseDouble(campoAltura.getText());
            Cilindro cilindro = new Cilindro(radio, altura);
            // Se calcula y muestra el volumen
            volumen.setText("Volumen (cm3): " + String.format("%.2f",
                    cilindro.calcularVolumen()));
            // Se calcula y muestra la superficie
            superficie.setText("Superficie (cm2): " + String.format("%.2f",
                    cilindro.calcularSuperficie()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de numero",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}