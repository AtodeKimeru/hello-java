package Animals;

public class Wolf extends Canid {

    @Override
    public String getSound() {
        return "Aullido";
    }

    @Override
    public String getFood() {
        return "Carnívoro";
    }

    @Override
    public String getHabitat() {
        return "Bosque";
    }

    @Override
    public String getScientificName() {
        return "Canis lupus";
    }
}