import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class EjercicioNo1Test {    

    @Test
    public void testPersonaConstructor() {
        Persona testPersona = new Persona("Juan", "Pérez", 123456789, 1990);
        
        assertNotNull(testPersona);
    }
}
