package creationaldesignpatterns.abstractfactory.model;

public class LuxuryCar1 implements Car {
    private String owner;

    public LuxuryCar1(String owner) {
        this.owner = owner;
    }

    @Override
    public int getTopSpeed() {
        return 200;
    }
}
