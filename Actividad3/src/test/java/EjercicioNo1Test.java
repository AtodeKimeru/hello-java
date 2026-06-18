import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class EjercicioNo1Test {    

    @Test
    public void testMeanGrade() {
        float[] grades = {4.5f, 3.1f, 4.2f};
        float expected = 3.9f;
        Grades testGrades = new Grades(grades);
        assertEquals(expected, testGrades.mean(), 0.1);
    }


    @Test
    public void testStandardDeviationGrade() {
        float[] grades = {4.5f, 3.1f, 4.2f};
        float expected = 0.737f;
        Grades testGrades = new Grades(grades);
        assertEquals(expected, testGrades.sd(), 0.1);
    }


    @Test
    public void testGreaterGrade() {
        float[] grades = {4.5f, 3.1f, 4.2f};
        float expected = 4.5f;
        Grades testGrades = new Grades(grades);
        assertEquals(expected, testGrades.greater(), 0.1);
    }


    @Test
    public void testLowerGrade() {
        float[] grades = {4.5f, 3.1f, 4.2f};
        float expected = 3.1f;
        Grades testGrades = new Grades(grades);
        assertEquals(expected, testGrades.lower(), 0.1);
    }


    @Test
    public void testGraphicInterface() {

        assertNotNull();
    }
}
