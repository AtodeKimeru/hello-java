package Professors;

public class TenuredProfessor extends Professor {

    int years = 0;

    @Override
    protected void print() {
        System.out.println("Es un profesor titular.");
    }

    protected void printYears() {
        System.out.println("Años = " + years);
    }
}