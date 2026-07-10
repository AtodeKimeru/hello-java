package CRUD;

import java.io.*;

public class CalculoCRUD {
    private static final String ARCHIVO = "friendsContact.txt";

    // --- CREATE OPERATION ---
    public static void crear(Contacto nuevo) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(ARCHIVO, "rw")) {
            String fila;
            while ((fila = raf.readLine()) != null) {
                String[] datos = fila.split("!");
                if (datos[0].trim().equalsIgnoreCase(nuevo.getNombre())) {
                    throw new IllegalArgumentException("El contacto '" + nuevo.getNombre() + "' ya existe.");
                }
            }
            // Append record cleanly at the end
            raf.seek(raf.length());
            raf.writeBytes(nuevo.getNombre() + "!" + nuevo.getNumero() + System.lineSeparator());
        }
    }

    // --- READ OPERATION ---
    public static Long buscar(String nombre) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(ARCHIVO, "rw")) {
            String fila;
            while ((fila = raf.readLine()) != null) {
                String[] datos = fila.split("!");
                if (datos[0].trim().equalsIgnoreCase(nombre)) {
                    return Long.parseLong(datos[1].trim());
                }
            }
        }
        return null;
    }

    // --- UPDATE OPERATION ---
    public static boolean actualizar(String nombre, long nuevoNumero) throws IOException {
        File f = new File(ARCHIVO);
        if (!f.exists())
            return false;

        File tempFile = new File("temp.txt");
        boolean encontrado = false;

        try (RandomAccessFile raf = new RandomAccessFile(f, "rw");
                PrintWriter pw = new PrintWriter(new FileWriter(tempFile))) {

            String fila;
            while ((fila = raf.readLine()) != null) {
                String[] datos = fila.split("!");
                if (datos[0].trim().equalsIgnoreCase(nombre)) {
                    pw.println(nombre + "!" + nuevoNumero);
                    encontrado = true;
                } else {
                    pw.println(fila);
                }
            }
        }

        if (encontrado) {
            if (!f.delete() || !tempFile.renameTo(f)) {
                throw new IOException("Fallo crítico al sobreescribir el archivo de contactos.");
            }
        } else {
            tempFile.delete();
        }
        return encontrado;
    }

    // --- DELETE OPERATION ---
    public static boolean eliminar(String nombre) throws IOException {
        File f = new File(ARCHIVO);
        if (!f.exists())
            return false;

        File tempFile = new File("temp.txt");
        boolean encontrado = false;

        try (RandomAccessFile raf = new RandomAccessFile(f, "rw");
                PrintWriter pw = new PrintWriter(new FileWriter(tempFile))) {

            String fila;
            while ((fila = raf.readLine()) != null) {
                String[] datos = fila.split("!");
                if (datos[0].trim().equalsIgnoreCase(nombre)) {
                    encontrado = true; // Skip this record to delete it
                } else {
                    pw.println(fila);
                }
            }
        }

        if (encontrado) {
            if (!f.delete() || !tempFile.renameTo(f)) {
                throw new IOException("Fallo crítico al actualizar el archivo tras la eliminación.");
            }
        } else {
            tempFile.delete();
        }
        return encontrado;
    }
}