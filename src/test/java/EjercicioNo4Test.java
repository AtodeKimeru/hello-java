import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class EjercicioNo4Test {    

    @Test
    public void testAgeCalculations() {
        
        Juan testJuan = new Juan(30);
                
        String expected = "Juan's age: 30\n" +
                         "Alberto's age: 20\n" +
                         "Ana's age: 40\n" +
                         "Mom's age: 90";
        
        assertEquals(expected, testJuan.sayAge());
    }
}

