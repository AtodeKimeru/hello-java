package Professors;

public class TestPolymorphism {

    public static void main(String[] args) {
        Professor professor1 = new TenuredProfessor();
        professor1.print();
    }
}
