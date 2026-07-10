package CRUD;

import javax.swing.*;
import java.io.IOException;

public class ControladorCRUD {
    public static void main(String[] args) {
        JFrame marcoPrincipal = new JFrame("Panel Control Amigos CRUD");
        VentanaPrincipal panelPrincipal = new VentanaPrincipal();

        marcoPrincipal.setContentPane(panelPrincipal);
        marcoPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoPrincipal.pack();
        marcoPrincipal.setLocationRelativeTo(null);
        marcoPrincipal.setVisible(true);

        // --- BUTTON ACTIONS ---

        // TRIGGER 1: CREATE ACTION
        panelPrincipal.getBtnCreate().addActionListener(e -> {
            FormulariosCRUD.VentanaCreate frm = new FormulariosCRUD.VentanaCreate();
            int op = JOptionPane.showConfirmDialog(marcoPrincipal, frm, "Crear Contacto", JOptionPane.OK_CANCEL_OPTION);
            if (op == JOptionPane.OK_OPTION) {
                try {
                    String nombre = frm.getNombre();
                    String numStr = frm.getNumeroTexto();
                    if (nombre.isEmpty() || numStr.isEmpty())
                        throw new IllegalArgumentException("Campos vacíos.");

                    long numero = Long.parseLong(numStr);
                    CalculoCRUD.crear(new Contacto(nombre, numero));
                    JOptionPane.showMessageDialog(marcoPrincipal, "¡Contacto registrado exitosamente!");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(marcoPrincipal, "Error: El número debe ser un entero válido.",
                            "Falla Formato", JOptionPane.ERROR_MESSAGE);
                } catch (IOException | IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(marcoPrincipal, ex.getMessage(), "Falla Operativa",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        // TRIGGER 2: READ ACTION
        panelPrincipal.getBtnRead().addActionListener(e -> {
            FormulariosCRUD.VentanaRead frm = new FormulariosCRUD.VentanaRead();
            int op = JOptionPane.showConfirmDialog(marcoPrincipal, frm, "Buscar Contacto",
                    JOptionPane.OK_CANCEL_OPTION);
            if (op == JOptionPane.OK_OPTION) {
                try {
                    String nombre = frm.getNombre();
                    if (nombre.isEmpty())
                        throw new IllegalArgumentException("Debe proveer un nombre.");

                    Long numEncontrado = CalculoCRUD.buscar(nombre);
                    if (numEncontrado != null) {
                        JOptionPane.showMessageDialog(marcoPrincipal,
                                "Contacto Encontrado:\n• Nombre: " + nombre + "\n• Teléfono: " + numEncontrado,
                                "Resultado", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(marcoPrincipal, "El contacto solicitado no existe.",
                                "Sin Resultados", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (IOException | IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(marcoPrincipal, ex.getMessage(), "Error I/O",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // TRIGGER 3: UPDATE ACTION
        panelPrincipal.getBtnUpdate().addActionListener(e -> {
            FormulariosCRUD.VentanaUpdate frm = new FormulariosCRUD.VentanaUpdate();
            int op = JOptionPane.showConfirmDialog(marcoPrincipal, frm, "Actualizar Contacto",
                    JOptionPane.OK_CANCEL_OPTION);
            if (op == JOptionPane.OK_OPTION) {
                try {
                    String nombre = frm.getNombre();
                    String numStr = frm.getNuevoNumeroTexto();
                    if (nombre.isEmpty() || numStr.isEmpty())
                        throw new IllegalArgumentException("Campos vacíos.");

                    long nuevoNum = Long.parseLong(numStr);
                    boolean modificado = CalculoCRUD.actualizar(nombre, nuevoNum);
                    if (modificado) {
                        JOptionPane.showMessageDialog(marcoPrincipal, "¡Contacto modificado de forma exitosa!");
                    } else {
                        JOptionPane.showMessageDialog(marcoPrincipal, "No se encontró ningún registro con ese nombre.",
                                "Error de Destino", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(marcoPrincipal, "Error: El número telefónico debe ser numérico.",
                            "Falla Formato", JOptionPane.ERROR_MESSAGE);
                } catch (IOException | IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(marcoPrincipal, ex.getMessage(), "Falla Operativa",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // TRIGGER 4: DELETE ACTION
        panelPrincipal.getBtnDelete().addActionListener(e -> {
            FormulariosCRUD.VentanaDelete frm = new FormulariosCRUD.VentanaDelete();
            int op = JOptionPane.showConfirmDialog(marcoPrincipal, frm, "Eliminar Contacto",
                    JOptionPane.OK_CANCEL_OPTION);
            if (op == JOptionPane.OK_OPTION) {
                try {
                    String nombre = frm.getNombre();
                    if (nombre.isEmpty())
                        throw new IllegalArgumentException("Debe escribir un nombre.");

                    boolean removido = CalculoCRUD.eliminar(nombre);
                    if (removido) {
                        JOptionPane.showMessageDialog(marcoPrincipal,
                                "¡El registro fue removido del archivo permanentemente!");
                    } else {
                        JOptionPane.showMessageDialog(marcoPrincipal, "No se localizó el contacto para eliminar.",
                                "No Encontrado", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (IOException | IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(marcoPrincipal, ex.getMessage(), "Error I/O",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}