package creationaldesignpatterns.abstractfactory.model;

public class LuxuryCar2 implements Car {
    private String owner;

    public LuxuryCar2(String owner) {
        this.owner = owner;
    }

    @Override
    public int getTopSpeed() {
        return 250;
    }
}
