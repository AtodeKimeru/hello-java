package Orders;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class OrderTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final PrintStream standardOut = System.out;
    private Order order;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        order = new Order();
    }

    @After
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    public void testCalculateOrderTwoItems() {
        order.calculateOrder("Sancocho", 5000, "Gaseosa", 2000);

        String expectedOutput = "El costo de Sancocho y Gaseosa es = $7000.0";
        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
    }

    @Test
    public void testCalculateOrderThreeItems() {
        order.calculateOrder("Crema de verduras", 5000, "Churrasco", 6000, "Gaseosa", 2000);

        String expectedOutput = "El costo de Crema de verduras + Churrasco + Gaseosa es = $13000.0";
        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
    }

    @Test
    public void testCalculateOrderFourItems() {
        order.calculateOrder("Crema de espinacas", 5000, "Salmón", 10000, "Tiramisú", 5000, "Gaseosa", 2000);

        String expectedOutput = "El costo de Crema de espinacas + Salmón + Gaseosa + Tiramisú es = $22000.0";
        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
    }

}
