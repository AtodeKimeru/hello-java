import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ScientificArticleTest {

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
    public void testFullConstructorAndPrint() {
        String[] keywords = { "Física", "Espacio", "Tiempo" };
        ScientificArticle article = new ScientificArticle(
                "La teoría especial de la relatividad",
                "Albert Einstein",
                keywords,
                "Anales de Física",
                1913,
                "Las leyes de la física son las mismas en todos los sistemas de referencia inerciales.");

        article.print();

        String output = outputStreamCaptor.toString().trim();
        assertTrue(output.contains("Título del artículo = La teoría especial de la relatividad"));
        assertTrue(output.contains("Autor del artículo = Albert Einstein"));
        assertTrue(output.contains("Física"));
        assertTrue(output.contains("Espacio"));
        assertTrue(output.contains("Tiempo"));
        assertTrue(output.contains("Publicación = Anales de Física"));
        assertTrue(output.contains("Año = 1913"));
        assertTrue(output.contains(
                "Resumen = Las leyes de la física son las mismas en todos los sistemas de referencia inerciales."));
    }

    @Test
    public void testChainedConstructors() {
        ScientificArticle minimalArticle = new ScientificArticle("Clean Code", "Robert C. Martin");
        minimalArticle.print();

        String output = outputStreamCaptor.toString().trim();
        assertTrue(output.contains("Título del artículo = Clean Code"));
        assertTrue(output.contains("Autor del artículo = Robert C. Martin"));
    }
}