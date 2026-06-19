package Archivos;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EjercicioNo5 {
    public static void main(String[] args) {
        // 1. Selector de archivos nativo del sistema operativo
        JFileChooser selector = new JFileChooser();
        selector.setDialogTitle("Seleccione el archivo de texto a leer");

        int resultadoSelector = selector.showOpenDialog(null);

        // Si el usuario cierra el explorador de archivos, abortamos el flujo
        if (resultadoSelector != JFileChooser.APPROVE_OPTION) {
            JOptionPane.showMessageDialog(null, "Operación cancelada por el usuario.");
            return;
        }

        // 2. Extraer la ruta del archivo que el usuario seleccionó a mano
        String rutaArchivo = selector.getSelectedFile().getAbsolutePath();

        try {
            // 3. Invocar al modelo para procesar la lectura física de bytes
            String textoLeido = CalculoLeerArchivo.leerContenido(rutaArchivo);

            // 4. Instanciar e inyectar los datos en la Vista
            VentanaLeerArchivo vista = new VentanaLeerArchivo();
            vista.setContenido(textoLeido);

            // 5. Desplegar de forma controlada la ventana final llena
            JOptionPane.showMessageDialog(null, vista, "Lectura de Archivo Exitosa", JOptionPane.PLAIN_MESSAGE);

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error Crítico:\nEl archivo no fue encontrado en la ruta especificada.",
                    "Archivo No Encontrado", JOptionPane.ERROR_MESSAGE);

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error Crítico de I/O:\nNo se pudo leer el flujo de datos del archivo.",
                    "Error de Lectura", JOptionPane.ERROR_MESSAGE);
        }
    }
}