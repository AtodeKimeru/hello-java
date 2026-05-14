public class Persona {
    private String nombre;
    private String apellido;
    private int documentoIdentidad;
    private int birthYear;


    public Persona(String nombre, String apellido, int documentoIdentidad, int birthYear) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documentoIdentidad = documentoIdentidad;
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", número documento de identidad = " + documentoIdentidad +
                ", año de nacimiento =" + birthYear +
                '}';
    }
}
