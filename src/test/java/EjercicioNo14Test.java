import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class EjercicioNo14Test {    

    @Test
    public void testSquare() {
        EjercicioNo14 testNumber = new EjercicioNo14(2);
        assertEquals(4, testNumber.square());
    }

    @Test
    public void testCube() {
        EjercicioNo14 testNumber = new EjercicioNo14(2);
        assertEquals(8, testNumber.cube());
    }

}

