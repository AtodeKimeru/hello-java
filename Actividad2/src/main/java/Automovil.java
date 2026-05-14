public class Automovil {
    public enum TipoCombustible {
        GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL
    }

    public enum TipoAutomovil {
        COMPACTO, SUBCOMPACTO, FAMILIAR, EJECUTIVO, SUV, CIUDAD
    }

    public enum Color {
        BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA
    }

    private String marca;
    private int año;
    private double capacidadTanque;
    private TipoCombustible tipoCombustible;
    private TipoAutomovil tipoAutomovil;
    private int numeroPuertas;
    private int numeroAsientos;
    private int velocidadMaxima;
    private Color color;
    private int velocidadActual;

    public Automovil(String marca, int año, double capacidadTanque, TipoCombustible tipoCombustible,
                     TipoAutomovil tipoAutomovil, int numeroPuertas, int numeroAsientos,
                     int velocidadMaxima, Color color, int velocidadActual) {
        this.marca = marca;
        this.año = año;
        this.capacidadTanque = capacidadTanque;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.numeroAsientos = numeroAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.velocidadActual = velocidadActual;
    }

    public String getBrand() {
        return marca;
    }

    public void setBrand(String marca) {
        this.marca = marca;
    }

    public int getYear() {
        return año;
    }

    public double getTankCapacity() {
        return capacidadTanque;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void acelerar(int velocidad) {
        int newVelocidad = velocidadActual + velocidad;
        if (newVelocidad > velocidadMaxima) {
            System.out.println("No puede exceder la velocidad máxima de " + velocidadMaxima + " km/h");
            velocidadActual = velocidadMaxima;
        } else {
            velocidadActual = newVelocidad;
        }
    }

    public void desacelerar(int velocidad) {
        int newVelocidad = velocidadActual - velocidad;
        if (newVelocidad < 0) {
            System.out.println("No puede tener una velocidad negativa");
            velocidadActual = 0;
        } else {
            velocidadActual = newVelocidad;
        }
    }

    public void frenar() {
        velocidadActual = 0;
    }

    public double calcularTiempoLlegada(double distancia) {
        if (velocidadActual == 0) {
            return 0;
        }
        return distancia / velocidadActual;
    }

    public String getAttributes() {
        return String.format("Automóvil Marca: %s, Año: %d, Capacidad del Tanque: %.1f litros," +
                "Tipo de Combustible: %s, Tipo de Automóvil: %s, Número de Puertas: %d," +
                "Número de Asientos: %d, Velocidad Máxima: %d km/h, Color: %s, Velocidad Actual: %d km/h",
                marca, año, capacidadTanque, tipoCombustible, tipoAutomovil, numeroPuertas,
                numeroAsientos, velocidadMaxima, color, velocidadActual);
    }

    @Override
    public String toString() {
        return getAttributes();
    }
}
