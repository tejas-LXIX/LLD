package creationaldesignpatterns.abstractfactory.model;

public class EconomyCar2 implements Car {
    private String owner;

    public EconomyCar2(String owner) {
        this.owner = owner;
    }

    @Override
    public int getTopSpeed() {
        return 70;
    }
}
