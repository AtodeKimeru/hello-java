package Professors;

public class TenuredProfessor extends Professor {

    @Override
    protected void print() {
        System.out.println("Es un profesor titular.");
    }
}