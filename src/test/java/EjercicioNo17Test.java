import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class EjercicioNo17Test {    

    @Test
    public void testArea() {
        Circle testCircle = new Circle(2);
        double expected = Math.PI * Math.pow(2, 2);
        assertEquals(expected, testCircle.area(), 0.01);
    }
    
    @Test
    public void testPerimeter() {
        Circle testCircle = new Circle(2);
        double expected = 2 * Math.PI * 2;
        assertEquals(expected, testCircle.perimeter(), 0.01);
    }
}