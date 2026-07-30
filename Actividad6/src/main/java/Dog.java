package Animals;

public class Dog extends Canid {

    @Override
    public String getSound() {
        return "Ladrido";
    }

    @Override
    public String getFood() {
        return "Carnívoro";
    }

    @Override
    public String getHabitat() {
        return "Doméstico";
    }

    @Override
    public String getScientificName() {
        return "Canis lupus familiaris";
    }
}