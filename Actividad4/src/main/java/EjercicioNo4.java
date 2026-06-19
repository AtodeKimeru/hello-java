package Excepciones;

import javax.swing.JOptionPane;

public class EjercicioNo4 {
    public static void main(String[] args) {
        VentanaMaraton vista = new VentanaMaraton();
        EquipoMaratonProgramacion equipo = null;

        // FASE 1: Capturar y levantar el Perfil del Equipo
        vista.mostrarFormularioEquipo();
        int op1 = JOptionPane.showConfirmDialog(null, vista, "Registro de Equipo",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (op1 != JOptionPane.OK_OPTION) {
            JOptionPane.showMessageDialog(null, "Proceso abortado.");
            return;
        }

        if (vista.getNombreEquipo().isEmpty() || vista.getUniversidad().isEmpty() || vista.getLenguaje().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los datos del equipo son obligatorios.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        equipo = new EquipoMaratonProgramacion(vista.getNombreEquipo(), vista.getUniversidad(), vista.getLenguaje());

        // FASE 2: Bucle interactivo controlado de inserción de integrantes
        while (!equipo.estaLleno()) {
            int slotActual = equipo.teamSize + 1;
            vista.mostrarFormularioProgramador();

            int op2 = JOptionPane.showConfirmDialog(null, vista, "Datos del Integrante #" + slotActual,
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

            // Permitir salir de forma segura si ya se cumple con el mínimo legal (2
            // integrantes)
            if (op2 != JOptionPane.OK_OPTION) {
                if (equipo.estaCompleto()) {
                    int confirmar = JOptionPane.showConfirmDialog(null,
                            "¿Desea cerrar el equipo con los " + equipo.teamSize + " integrantes registrados?",
                            "Cierre de Registro", JOptionPane.YES_NO_OPTION);
                    if (confirmar == JOptionPane.YES_OPTION)
                        break;
                    else
                        continue;
                } else {
                    JOptionPane.showMessageDialog(null, "Un equipo requiere un mínimo de 2 integrantes para competir.",
                            "Registro Incompleto", JOptionPane.WARNING_MESSAGE);
                    continue;
                }
            }

            // Procesar y Validar Inputs utilizando acumulación estructurada de excepciones
            try {
                String nProg = vista.getNombreProg();
                String aProg = vista.getApellidosProg();

                StringBuilder alertas = new StringBuilder();
                boolean fallas = false;

                try {
                    EquipoMaratonProgramacion.validarCampo(nProg);
                } catch (IllegalArgumentException e) {
                    alertas.append("• Nombre: ").append(e.getMessage()).append("\n");
                    fallas = true;
                }

                try {
                    EquipoMaratonProgramacion.validarCampo(aProg);
                } catch (IllegalArgumentException e) {
                    alertas.append("• Apellidos: ").append(e.getMessage()).append("\n");
                    fallas = true;
                }

                if (fallas) {
                    throw new IllegalArgumentException(alertas.toString());
                }

                // Si los datos están limpios, instanciar e insertar
                Programador p = new Programador(nProg, aProg);
                equipo.añadir(p);
                JOptionPane.showMessageDialog(null, "Integrante registrado con éxito.");

            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "Errores detectados en la información:\n" + e.getMessage(),
                        "Error de Validación", JOptionPane.ERROR_MESSAGE);
            } catch (EquipoCompletoException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Límite Excedido", JOptionPane.WARNING_MESSAGE);
                break;
            }
        }

        // Resumen Final Exitoso
        StringBuilder resumen = new StringBuilder("=== Registro Exitoso del Equipo ===\n");
        resumen.append("• Equipo: ").append(equipo.nombreEquipo).append("\n");
        resumen.append("• Representando a: ").append(equipo.universidad).append("\n");
        resumen.append("• Lenguaje: ").append(equipo.lenguajeProgramacion).append("\n");
        resumen.append("• Total Integrantes: ").append(equipo.teamSize).append("/3\n\nIntegrantes:\n");

        for (int i = 0; i < equipo.teamSize; i++) {
            resumen.append("  [").append(i + 1).append("] ").append(equipo.programadores[i].nombre).append(" ")
                    .append(equipo.programadores[i].apellidos).append("\n");
        }

        JOptionPane.showMessageDialog(null, resumen.toString(), "Maratón Inscripción Finalizada",
                JOptionPane.INFORMATION_MESSAGE);
    }
}