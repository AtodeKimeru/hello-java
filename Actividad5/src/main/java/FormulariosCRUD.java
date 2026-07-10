package CRUD;

import javax.swing.*;
import java.awt.*;

public class FormulariosCRUD {

    // PANEL: CREATE FORM
    public static class VentanaCreate extends JPanel {
        private JTextField txtNombre = new JTextField();
        private JTextField txtNumero = new JTextField();

        public VentanaCreate() {
            setLayout(new GridLayout(2, 2, 8, 8));
            add(new JLabel("Nombre del Amigo:"));
            add(txtNombre);
            add(new JLabel("Número Telefónico:"));
            add(txtNumero);
        }

        public String getNombre() {
            return txtNombre.getText().trim();
        }

        public String getNumeroTexto() {
            return txtNumero.getText().trim();
        }
    }

    // PANEL: READ FORM
    public static class VentanaRead extends JPanel {
        private JTextField txtNombre = new JTextField();

        public VentanaRead() {
            setLayout(new GridLayout(1, 2, 8, 8));
            add(new JLabel("Buscar por Nombre:"));
            add(txtNombre);
        }

        public String getNombre() {
            return txtNombre.getText().trim();
        }
    }

    // PANEL: UPDATE FORM
    public static class VentanaUpdate extends JPanel {
        private JTextField txtNombre = new JTextField();
        private JTextField txtNuevoNumero = new JTextField();

        public VentanaUpdate() {
            setLayout(new GridLayout(2, 2, 8, 8));
            add(new JLabel("Nombre Existente:"));
            add(txtNombre);
            add(new JLabel("Nuevo Número Telefónico:"));
            add(txtNuevoNumero);
        }

        public String getNombre() {
            return txtNombre.getText().trim();
        }

        public String getNuevoNumeroTexto() {
            return txtNuevoNumero.getText().trim();
        }
    }

    // PANEL: DELETE FORM
    public static class VentanaDelete extends JPanel {
        private JTextField txtNombre = new JTextField();

        public VentanaDelete() {
            setLayout(new GridLayout(1, 2, 8, 8));
            add(new JLabel("Eliminar Contacto (Nombre):"));
            add(txtNombre);
        }

        public String getNombre() {
            return txtNombre.getText().trim();
        }
    }
}
