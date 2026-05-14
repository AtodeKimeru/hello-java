public class EjercicioNo5 {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan", "Pérez", "1234567890",
                                                     CuentaBancaria.TipoCuenta.AHORROS);
        CuentaBancaria cuenta2 = new CuentaBancaria("María", "García", "9876543210",
                                                     CuentaBancaria.TipoCuenta.CORRIENTE);

        System.out.println("=== Cuenta 1 ===");
        System.out.println(cuenta1.getAttributesString());
        
        cuenta1.consignar(500);
        System.out.println("Después de consignar 500: Saldo = " + cuenta1.consultarSaldo());

        cuenta1.retirar(200);
        System.out.println("Después de retirar 200: Saldo = " + cuenta1.consultarSaldo());

        System.out.println("\n=== Cuenta 2 ===");
        System.out.println(cuenta2.getAttributesString());
        
        cuenta2.consignar(1000);
        System.out.println("Después de consignar 1000: Saldo = " + cuenta2.consultarSaldo());

        cuenta2.retirar(300);
        System.out.println("Después de retirar 300: Saldo = " + cuenta2.consultarSaldo());

        cuenta2.retirar(1000);
        System.out.println("Intento de retirar 1000 (fondos insuficientes): Saldo = " + cuenta2.consultarSaldo());
    }
}
