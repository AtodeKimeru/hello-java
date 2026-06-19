package Excepciones;

public class EquipoMaratonProgramacion {
    String nombreEquipo;
    String universidad;
    String lenguajeProgramacion;
    Programador[] programadores;
    int teamSize;

    public EquipoMaratonProgramacion(String nombreEquipo, String universidad, String lenguajeProgramacion) {
        this.nombreEquipo = nombreEquipo;
        this.universidad = universidad;
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.programadores = new Programador[3]; // Límite máximo establecido
        this.teamSize = 0;
    }

    public boolean estaLleno() {
        return teamSize == programadores.length;
    }

    public boolean estaCompleto() {
        // El enunciado estipula mínimo 2 participantes para considerarse válido
        // completo
        return teamSize >= 2;
    }

    public void añadir(Programador p) throws EquipoCompletoException {
        if (estaLleno()) {
            throw new EquipoCompletoException("El equipo está completo. No se pudo agregar al programador.");
        }
        programadores[teamSize] = p;
        teamSize++;
    }

    public static void validarCampo(String campo) throws IllegalArgumentException {
        if (campo == null || campo.isEmpty()) {
            throw new IllegalArgumentException("El campo no puede estar vacío.");
        }
        if (campo.length() > 20) {
            throw new IllegalArgumentException("La longitud no debe ser superior a 20 caracteres.");
        }
        for (int i = 0; i < campo.length(); i++) {
            if (Character.isDigit(campo.charAt(i))) {
                throw new IllegalArgumentException("El nombre/apellido no puede tener dígitos numéricos.");
            }
        }
    }
}