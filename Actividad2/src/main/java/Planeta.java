import java.text.DecimalFormat;

public class Planeta {
    public enum TipoPlaneta {
        GASEOSO, TERRESTRE, ENANO
    }

    private String nombre;
    private int satelites;
    private double masa;
    private double volumen;
    private int diametro;
    private int distanciaAlSol;
    private TipoPlaneta tipo;
    private boolean tieneAnillos;

    public Planeta(String nombre, int satelites, double masa, double volumen, 
                   int diametro, int distanciaAlSol, TipoPlaneta tipo, boolean tieneAnillos) {
        this.nombre = nombre;
        this.satelites = satelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaAlSol = distanciaAlSol;
        this.tipo = tipo;
        this.tieneAnillos = tieneAnillos;
    }

    public double densidad() {
        return masa / volumen;
    }

    public boolean esExterior() {
        // Asteroid belt is between 2.1 and 3.4 UA
        // 1 UA = 149,597,870 km
        // 2.1 UA = 314,055,327 km
        // 3.4 UA = 508,632,758 km
        double asteroidBeltMin = 2.1 * 149597870;
        double asteroidBeltMax = 3.4 * 149597870;
        return distanciaAlSol > asteroidBeltMax;
    }

    @Override
    public String toString() {
        // Format masa and volumen to match expected scientific notation
        String masaStr = formatScientific(masa, 3);
        String volumenStr = formatScientific(volumen, 5);
        return String.format("%s (Planeta Tipo: %s, Masa: %s kg, " +
                "Volumen: %s km³, diametro: %d km, Distancia al Sol: %d millones km, Tiene Anillos: %s)",
                nombre, tipo, masaStr, volumenStr, diametro, distanciaAlSol, tieneAnillos);
    }
    
    private String formatScientific(double value, int decimals) {
        String pattern = "0." + buildZeros(decimals) + "E0";
        DecimalFormat df = new DecimalFormat(pattern);
        return df.format(value);
    }
    
    private String buildZeros(int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append("0");
        }
        return sb.toString();
    }
}
