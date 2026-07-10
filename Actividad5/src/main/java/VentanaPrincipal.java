package CRUD;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JPanel {
    private JButton btnCreate, btnRead, btnUpdate, btnDelete;

    public VentanaPrincipal() {
        setLayout(new GridLayout(2, 2, 15, 15));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        btnCreate = new JButton("CREATE (Añadir)");
        btnRead = new JButton("READ (Buscar)");
        btnUpdate = new JButton("UPDATE (Actualizar)");
        btnDelete = new JButton("DELETE (Eliminar)");

        add(btnCreate);
        add(btnRead);
        add(btnUpdate);
        add(btnDelete);
    }

    public JButton getBtnCreate() {
        return btnCreate;
    }

    public JButton getBtnRead() {
        return btnRead;
    }

    public JButton getBtnUpdate() {
        return btnUpdate;
    }

    public JButton getBtnDelete() {
        return btnDelete;
    }
}