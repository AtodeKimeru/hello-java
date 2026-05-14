import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class EjercicioNo3Test {    

    @Test
    public void testAutomovilConstructor() {
        Automovil testAuto = new Automovil("Toyota", 2020, 2.5, 
                                            Automovil.TipoCombustible.GASOLINA,
                                            Automovil.TipoAutomovil.COMPACTO, 4, 5, 180,
                                            Automovil.Color.BLANCO, 0);
        
        assertNotNull(testAuto);
    }

    @Test
    public void testAutomovilGetters() {
        Automovil testAuto = new Automovil("Toyota", 2020, 2.5, 
                                            Automovil.TipoCombustible.GASOLINA,
                                            Automovil.TipoAutomovil.COMPACTO, 4, 5, 180,
                                            Automovil.Color.BLANCO, 0);
        
        assertEquals("Toyota", testAuto.getBrand());
        assertEquals(2020, testAuto.getYear());
        assertEquals(2.5, testAuto.getTankCapacity(), 0.01);
    }

    @Test
    public void testAutomovilSetters() {
        Automovil testAuto = new Automovil("Toyota", 2020, 2.5, 
                                            Automovil.TipoCombustible.GASOLINA,
                                            Automovil.TipoAutomovil.COMPACTO, 4, 5, 180,
                                            Automovil.Color.BLANCO, 0);
        assertEquals("Toyota", testAuto.getBrand());
        testAuto.setBrand("Honda");
        assertEquals("Honda", testAuto.getBrand());
        

    }


    @Test
    public void testStringAttributes() {
        Automovil testAuto = new Automovil("Toyota", 2020, 2.5, 
                                            Automovil.TipoCombustible.GASOLINA,
                                            Automovil.TipoAutomovil.COMPACTO, 4, 5, 180,
                                            Automovil.Color.BLANCO, 0);
        String expected = "Automóvil Marca: Toyota, Año: 2020, Capacidad del Tanque: 2.5 litros," +
                          "Tipo de Combustible: GASOLINA, Tipo de Automóvil: COMPACTO, Número de Puertas: 4," +
                          "Número de Asientos: 5, Velocidad Máxima: 180 km/h, Color: BLANCO, Velocidad Actual: 0 km/h";
       
        assertEquals(expected, testAuto.getAttributes());
    }
    
    @Test
    public void testAccelerate() {
        Automovil testAuto = new Automovil("Honda", 2022, 1.8, 
                                            Automovil.TipoCombustible.GASOLINA,
                                            Automovil.TipoAutomovil.COMPACTO, 4, 5, 200,
                                            Automovil.Color.NEGRO, 50);
        
        testAuto.acelerar(30);
        assertEquals(80, testAuto.getVelocidadActual(), 0.01);
    }
    
    @Test
    public void testDecelerate() {
        Automovil testAuto = new Automovil("Ford", 2021, 2.0, 
                                            Automovil.TipoCombustible.DIESEL,
                                            Automovil.TipoAutomovil.FAMILIAR, 5, 7, 190,
                                            Automovil.Color.ROJO, 80);
        
        testAuto.desacelerar(30);
        assertEquals(50, testAuto.getVelocidadActual(), 0.01);
    }
    
    @Test
    public void testBrake() {
        Automovil testAuto = new Automovil("BMW", 2023, 3.0, 
                                            Automovil.TipoCombustible.GASOLINA,
                                            Automovil.TipoAutomovil.EJECUTIVO, 4, 5, 220,
                                            Automovil.Color.AZUL, 100);
        
        testAuto.frenar();
        assertEquals(0, testAuto.getVelocidadActual(), 0.01);
    }
    
    @Test
    public void testEstimatedArrivalTime() {
        Automovil testAuto = new Automovil("Mazda", 2020, 1.6, 
                                            Automovil.TipoCombustible.GASOLINA,
                                            Automovil.TipoAutomovil.COMPACTO, 4, 5, 180,
                                            Automovil.Color.VERDE, 100);
        
        // Distance = 100 km, velocity = 100 km/h, time = 1 hour
        double estimatedTime = testAuto.calcularTiempoLlegada(100);
        assertEquals(1.0, estimatedTime, 0.01);
    }
    
    @Test
    public void testMaxSpeedLimitNotExceeded() {
        Automovil testAuto = new Automovil("Audi", 2022, 2.5, 
                                            Automovil.TipoCombustible.GASOLINA,
                                            Automovil.TipoAutomovil.EJECUTIVO, 4, 5, 150,
                                            Automovil.Color.NEGRO, 140);
        
        testAuto.acelerar(50);
        // Should not exceed max speed of 150
        assertEquals(150, testAuto.getVelocidadActual(), 0.01);
    }
}
