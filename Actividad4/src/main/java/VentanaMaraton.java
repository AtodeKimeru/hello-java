package Excepciones;

import javax.swing.*;
import java.awt.*;

public class VentanaMaraton extends JPanel {
    private JTextField txtNombreEquipo, txtUniversidad, txtLenguaje;
    private JTextField txtNombreProg, txtApellidosProg;
    private CardLayout navegador;
    private JPanel panelEquipo, panelProgramador;

    public VentanaMaraton() {
        navegador = new CardLayout();
        setLayout(navegador);

        // --- FASE 1: PANEL DATOS DEL EQUIPO ---
        panelEquipo = new JPanel(new GridLayout(3, 2, 10, 10));
        txtNombreEquipo = new JTextField();
        txtUniversidad = new JTextField();
        txtLenguaje = new JTextField();

        panelEquipo.add(new JLabel("Nombre del Equipo:"));
        panelEquipo.add(txtNombreEquipo);
        panelEquipo.add(new JLabel("Universidad:"));
        panelEquipo.add(txtUniversidad);
        panelEquipo.add(new JLabel("Lenguaje Objetivo:"));
        panelEquipo.add(txtLenguaje);

        // --- FASE 2: PANEL INTEGRANTE INDIVIDUAL ---
        panelProgramador = new JPanel(new GridLayout(2, 2, 10, 10));
        txtNombreProg = new JTextField();
        txtApellidosProg = new JTextField();

        panelProgramador.add(new JLabel("Nombre del Integrante:"));
        panelProgramador.add(txtNombreProg);
        panelProgramador.add(new JLabel("Apellidos del Integrante:"));
        panelProgramador.add(txtApellidosProg);

        // Añadir pantallas al gestor
        add(panelEquipo, "EQUIPO");
        add(panelProgramador, "PROGRAMADOR");
    }

    public void mostrarFormularioEquipo() {
        navegador.show(this, "EQUIPO");
    }

    public void mostrarFormularioProgramador() {
        txtNombreProg.setText("");
        txtApellidosProg.setText("");
        navegador.show(this, "PROGRAMADOR");
    }

    // Getters de extracción
    public String getNombreEquipo() {
        return txtNombreEquipo.getText().trim();
    }

    public String getUniversidad() {
        return txtUniversidad.getText().trim();
    }

    public String getLenguaje() {
        return txtLenguaje.getText().trim();
    }

    public String getNombreProg() {
        return txtNombreProg.getText().trim();
    }

    public String getApellidosProg() {
        return txtApellidosProg.getText().trim();
    }
}