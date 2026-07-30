package Animals;

public class TestAnimals {

    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Wolf();
        animals[3] = new Lion();

        for (Animal animal : animals) {
            System.out.println(animal.getScientificName());
            System.out.println("Sonido: " + animal.getSound());
            System.out.println("Alimentos: " + animal.getFood());
            System.out.println("Hábitat: " + animal.getHabitat());
            System.out.println();
        }
    }
}