public class CuentaBancaria {
    public enum TipoCuenta {
        AHORROS, CORRIENTE
    }

    private String nombre;
    private String apellido;
    private String numeroCuenta;
    private TipoCuenta tipoCuenta;
    private double saldo;

    public CuentaBancaria(String nombre, String apellido, String numeroCuenta, TipoCuenta tipoCuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0.0;
    }

    public String getAttributesString() {
        return String.format("%s %s - Cuenta: %s # %s - Saldo: %.2f", 
                nombre, apellido, tipoCuenta, numeroCuenta, saldo);
    }

    public void consignar(double cantidad) {
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("Fondos insuficientes. No se puede realizar el retiro.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return getAttributesString();
    }
}
