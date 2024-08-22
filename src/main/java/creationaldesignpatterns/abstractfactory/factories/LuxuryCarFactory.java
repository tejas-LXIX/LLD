package creationaldesignpatterns.abstractfactory.factories;

import creationaldesignpatterns.abstractfactory.model.*;

public class LuxuryCarFactory implements VehicleFactory {
    @Override
    public Car getCar(int price, String owner) {
        if (price >= 1000000 && price <= 2000000) {
            return new LuxuryCar1(owner);
        } else {
            return new LuxuryCar2(owner);
        }
    }
}
