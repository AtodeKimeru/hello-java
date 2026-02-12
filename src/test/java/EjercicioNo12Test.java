import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class EjercicioNo12Test {    

    @Test
    public void testGetGrossSalary() {
        Salaryman salaryman = new Salaryman(48);
        assertEquals(5000f, salaryman.getGrossSalary(), 0.01);
    }

    @Test
    public void testGetRetentionTax() {
        Salaryman salaryman = new Salaryman(48);
        float expected = 5000f * 0.125f;
        assertEquals(expected, salaryman.getRetentionTax(), 0.01);
    }

    @Test
    public void testGetNetSalary() {
        Salaryman salaryman = new Salaryman(48);
        float expected = 5000f - (5000f * 0.125f);
        assertEquals(expected, salaryman.getNetSalary(), 0.01);
    }
}

