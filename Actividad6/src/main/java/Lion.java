package Animals;

public class Lion extends Felid {

    @Override
    public String getSound() {
        return "Rugido";
    }

    @Override
    public String getFood() {
        return "Carnívoro";
    }

    @Override
    public String getHabitat() {
        return "Praderas";
    }

    @Override
    public String getScientificName() {
        return "Panthera leo";
    }
}