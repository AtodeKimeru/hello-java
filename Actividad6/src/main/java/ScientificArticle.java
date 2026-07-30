import java.util.Arrays;

public class ScientificArticle {
    private String title;
    private String author;
    private String[] keywords = new String[3];
    private String publication;
    private int year;
    private String summary;

    public ScientificArticle(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public ScientificArticle(String title, String author, String[] keywords, String publication, int year) {
        this(title, author);
        this.keywords = keywords;
        this.publication = publication;
        this.year = year;
    }

    public ScientificArticle(String title, String author, String[] keywords, String publication, int year,
            String summary) {
        this(title, author, keywords, publication, year);
        this.summary = summary;
    }

    public void print() {
        System.out.println("Título del artículo = " + title);
        System.out.println("Autor del artículo = " + author);
        System.out.println("Palabras clave = ");
        if (keywords != null) {
            for (String keyword : keywords) {
                System.out.println(keyword);
            }
        }
        System.out.println("Publicación = " + publication);
        System.out.println("Año = " + year);
        System.out.println("Resumen = " + summary);
    }

    public static void main(String[] args) {
        String[] keywords = { "Física", "Espacio", "Tiempo" };
        ScientificArticle article = new ScientificArticle(
                "La teoría especial de la relatividad",
                "Albert Einstein",
                keywords,
                "Anales de Física",
                1913,
                "Las leyes de la física son las mismas en todos los sistemas de referencia inerciales.");
        article.print();
    }
}