package CRUD;

public class Contacto {
    private String nombre;
    private long numero;

    public Contacto(String nombre, long numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public long getNumero() {
        return numero;
    }
}