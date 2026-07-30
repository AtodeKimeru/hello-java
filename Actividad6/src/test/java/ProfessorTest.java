package Professors;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ProfessorTest {

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
    public void testPolymorphicPrint() {
        Professor professor1 = new TenuredProfessor();
        professor1.print();

        assertEquals("Es un profesor titular.", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testBaseClassPrint() {
        Professor professorBase = new Professor();
        professorBase.print();

        assertEquals("Es un profesor.", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testPrintYearsWithCasting() {
        Professor professor1 = new TenuredProfessor();
        ((TenuredProfessor) professor1).printYears();

        assertEquals("Años = 0", outputStreamCaptor.toString().trim());
    }
}