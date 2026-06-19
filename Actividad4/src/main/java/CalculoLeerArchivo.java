package Archivos;

import java.io.*;

public class CalculoLeerArchivo {

    /**
     * Abre un archivo de texto utilizando un flujo de bytes acoplado a un buffer y
     * extrae su contenido.
     * 
     * @param rutaAbsoluta Ubicación del archivo en el disco.
     * @return El contenido completo del archivo como un String.
     * @throws FileNotFoundException Si el archivo no existe.
     * @throws IOException           Si ocurre un error durante el flujo de lectura.
     */
    public static String leerContenido(String rutaAbsoluta) throws FileNotFoundException, IOException {
        StringBuilder constructorTexto = new StringBuilder();

        // Declaración externa de flujos para asegurar su visibilidad en el cierre
        FileInputStream archivoBytes = null;
        InputStreamReader conversorCaracteres = null;
        BufferedReader filtroBuffer = null;

        try {
            archivoBytes = new FileInputStream(rutaAbsoluta);
            conversorCaracteres = new InputStreamReader(archivoBytes);
            filtroBuffer = new BufferedReader(conversorCaracteres);

            String linea;
            while ((linea = filtroBuffer.readLine()) != null) {
                constructorTexto.append(linea).append("\n");
            }

        } finally {
            // El bloque finally garantiza que los recursos del Sistema Operativo se liberen
            if (filtroBuffer != null) {
                filtroBuffer.close();
            }
            if (conversorCaracteres != null) {
                conversorCaracteres.close();
            }
            if (archivoBytes != null) {
                archivoBytes.close();
            }
        }

        return constructorTexto.toString();
    }
}