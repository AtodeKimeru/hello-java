package Professors;

public class Ejercicio46 {
    public static void main(String[] args) {
        Professor professor1 = new Professor();
        professor1.print();
        System.out.println("===============================");

        TenuredProfessor professor2 = new TenuredProfessor();
        professor2.print();
        professor2.printYears();
    }
}
