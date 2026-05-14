import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.beans.Transient;


public class EjercicioNo2Test {    

    @Test
    public void testPlanetConstructor() {
        Planeta testPlaneta = new Planeta("Tierra", 1, 5.972e24, 1.08321e12, 
                                           12742, 150, Planeta.TipoPlaneta.TERRESTRE, true);
        
        assertNotNull(testPlaneta);
    }

    @Test
    public void testPlanetAttributes() {
        Planeta testPlaneta = new Planeta("Tierra", 1, 5.972e24, 1.08321e12, 
                                           12742, 150, Planeta.TipoPlaneta.TERRESTRE, true);
        
        String expected = "Tierra (Planeta Tipo: TERRESTRE, Masa: 5.972E24 kg, " +
         "Volumen: 1.08321E12 km³, diametro: 12742 km, Distancia al Sol: 150 millones km, Tiene Anillos: true)";
        assertEquals(expected, testPlaneta.toString());
    }
    
    @Test
    public void testDensityCalculation() {
        // Planeta: masa = 5.972e24 kg, volumen = 1.08321e12 km³
        Planeta testPlaneta = new Planeta("Tierra", 1, 5.972e24, 1.08321e12, 
                                           12742, 150, Planeta.TipoPlaneta.TERRESTRE, true);
        
        double expectedDensity = 5.972e24 / 1.08321e12;
        assertEquals(expectedDensity, testPlaneta.densidad(), 0.01);
    }
    
    @Test
    public void testExteriorPlanetTrue() {
        // Distancia al sol: 5.2 UA * 149597870 km/UA = 777,708,844 km
        // This is beyond the asteroid belt (2.1 - 3.4 UA)
        Planeta testPlaneta = new Planeta("Júpiter", 95, 1.898e27, 1.4313e15, 
                                           139820, 778000000, Planeta.TipoPlaneta.GASEOSO, true);
        
        assertTrue(testPlaneta.esExterior());
    }
    
    @Test
    public void testExteriorPlanetFalse() {
        // Distancia al sol: 150 millones km (1 UA), within inner solar system
        Planeta testPlaneta = new Planeta("Tierra", 1, 5.972e24, 1.08321e12, 
                                           12742, 150, Planeta.TipoPlaneta.TERRESTRE, true);
        
        assertFalse(testPlaneta.esExterior());
    }
}
