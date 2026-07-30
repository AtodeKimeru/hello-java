package Animals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AnimalsTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final PrintStream standardOut = System.out;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @After
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    public void testDogAttributes() {
        Animal dog = new Dog();
        assertEquals("Canis lupus familiaris", dog.getScientificName());
        assertEquals("Ladrido", dog.getSound());
        assertEquals("Carnívoro", dog.getFood());
        assertEquals("Doméstico", dog.getHabitat());
    }

    @Test
    public void testWolfAttributes() {
        Animal wolf = new Wolf();
        assertEquals("Canis lupus", wolf.getScientificName());
        assertEquals("Aullido", wolf.getSound());
        assertEquals("Carnívoro", wolf.getFood());
        assertEquals("Bosque", wolf.getHabitat());
    }

    @Test
    public void testLionAttributes() {
        Animal lion = new Lion();
        assertEquals("Panthera leo", lion.getScientificName());
        assertEquals("Rugido", lion.getSound());
        assertEquals("Carnívoro", lion.getFood());
        assertEquals("Praderas", lion.getHabitat());
    }

    @Test
    public void testCatAttributes() {
        Animal cat = new Cat();
        assertEquals("Felis silvestris catus", cat.getScientificName());
        assertEquals("Maullido", cat.getSound());
        assertEquals("Ratones", cat.getFood());
        assertEquals("Doméstico", cat.getHabitat());
    }

    @Test
    public void testMainOutput() {
        TestAnimals.main(new String[] {});
        String output = outputStreamCaptor.toString().trim();

        assertTrue(output.contains("Felis silvestris catus"));
        assertTrue(output.contains("Sonido: Maullido"));
        assertTrue(output.contains("Canis lupus familiaris"));
        assertTrue(output.contains("Sonido: Ladrido"));
        assertTrue(output.contains("Canis lupus"));
        assertTrue(output.contains("Sonido: Aullido"));
        assertTrue(output.contains("Panthera leo"));
        assertTrue(output.contains("Sonido: Rugido"));
    }
}