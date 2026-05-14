public class EjercicioNo3 {
    public static void main(String[] args) {
        Automovil auto = new Automovil("Toyota", 2020, 2.5, 
                                        Automovil.TipoCombustible.GASOLINA,
                                        Automovil.TipoAutomovil.COMPACTO, 4, 5, 180,
                                        Automovil.Color.BLANCO, 100);

        System.out.println(auto.getAttributes());
        System.out.println("Velocidad actual: " + auto.getVelocidadActual() + " km/h");

        auto.acelerar(20);
        System.out.println("Después de acelerar 20 km/h: " + auto.getVelocidadActual() + " km/h");

        auto.desacelerar(50);
        System.out.println("Después de desacelerar 50 km/h: " + auto.getVelocidadActual() + " km/h");

        auto.frenar();
        System.out.println("Después de frenar: " + auto.getVelocidadActual() + " km/h");
    }
}
