package Animals;

public class Cat extends Felid {

    @Override
    public String getSound() {
        return "Maullido";
    }

    @Override
    public String getFood() {
        return "Ratones";
    }

    @Override
    public String getHabitat() {
        return "Doméstico";
    }

    @Override
    public String getScientificName() {
        return "Felis silvestris catus";
    }
}