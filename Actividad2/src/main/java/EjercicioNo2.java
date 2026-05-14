public class EjercicioNo2 {
    public static void main(String[] args) {
        Planeta tierra = new Planeta("Tierra", 1, 5.972e24, 1.08321e12, 12742, 150, 
                                      Planeta.TipoPlaneta.TERRESTRE, false);
        Planeta jupiter = new Planeta("Júpiter", 95, 1.898e27, 1.4313e15, 139820, 778000000, 
                                      Planeta.TipoPlaneta.GASEOSO, true);

        System.out.println(tierra);
        System.out.println("Densidad: " + tierra.densidad());
        System.out.println("¿Es exterior?: " + tierra.esExterior());
        System.out.println();

        System.out.println(jupiter);
        System.out.println("Densidad: " + jupiter.densidad());
        System.out.println("¿Es exterior?: " + jupiter.esExterior());
    }
}
