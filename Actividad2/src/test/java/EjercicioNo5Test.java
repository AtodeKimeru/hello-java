import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class EjercicioNo5Test {    

    @Test
    public void testCuentaBancariaAttributesString() {
        CuentaBancaria testCuenta = new CuentaBancaria("Juan", "Pérez", "1234567890",
                                                        CuentaBancaria.TipoCuenta.AHORROS);
        
        assertNotNull(testCuenta);
        assertEquals("Juan Pérez - Cuenta: AHORROS # 1234567890 - Saldo: 0.00", testCuenta.getAttributesString());
    }
    
    @Test
    public void testDeposit() {
        CuentaBancaria testCuenta = new CuentaBancaria("María", "García", "9876543210",
                                                        CuentaBancaria.TipoCuenta.CORRIENTE);
        
        testCuenta.consignar(500);
        assertEquals(500, testCuenta.consultarSaldo(), 0.01);
    }
    
    @Test
    public void testMultipleDeposits() {
        CuentaBancaria testCuenta = new CuentaBancaria("Carlos", "López", "5555555555",
                                                        CuentaBancaria.TipoCuenta.AHORROS);
        
        testCuenta.consignar(300);
        testCuenta.consignar(200);
        testCuenta.consignar(150);
        assertEquals(650, testCuenta.consultarSaldo(), 0.01);
    }
    
    @Test
    public void testWithdrawal() {
        CuentaBancaria testCuenta = new CuentaBancaria("Ana", "Rodríguez", "1111111111",
                                                        CuentaBancaria.TipoCuenta.AHORROS);
        
        testCuenta.consignar(1000);
        testCuenta.retirar(300);
        assertEquals(700, testCuenta.consultarSaldo(), 0.01);
    }
    
    @Test
    public void testWithdrawalInsufficientFunds() {
        CuentaBancaria testCuenta = new CuentaBancaria("Pedro", "Martínez", "2222222222",
                                                        CuentaBancaria.TipoCuenta.CORRIENTE);
        
        testCuenta.consignar(500);
        // Try to withdraw more than available balance
        testCuenta.retirar(700);
        // Balance should remain unchanged
        assertEquals(500, testCuenta.consultarSaldo(), 0.01);
    }
    
    @Test
    public void testConsultBalance() {
        CuentaBancaria testCuenta = new CuentaBancaria("Sofia", "Díaz", "3333333333",
                                                        CuentaBancaria.TipoCuenta.AHORROS);
        
        double initialBalance = testCuenta.consultarSaldo();
        assertEquals(0, initialBalance, 0.01);
        
        testCuenta.consignar(750);
        double updatedBalance = testCuenta.consultarSaldo();
        assertEquals(750, updatedBalance, 0.01);
    }
    
    @Test
    public void testWithdrawalMultipleOperations() {
        CuentaBancaria testCuenta = new CuentaBancaria("Luis", "Fernández", "4444444444",
                                                        CuentaBancaria.TipoCuenta.CORRIENTE);
        
        testCuenta.consignar(1500);
        testCuenta.retirar(200);
        testCuenta.retirar(300);
        testCuenta.consignar(500);
        
        assertEquals(1500, testCuenta.consultarSaldo(), 0.01);
    }
}
