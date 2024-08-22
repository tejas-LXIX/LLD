package creationaldesignpatterns.abstractfactory.model;

public class EconomyCar1 implements Car {
    private String owner;

    public EconomyCar1(String owner) {
        this.owner = owner;
    }

    @Override
    public int getTopSpeed() {
        return 100;
    }
}
