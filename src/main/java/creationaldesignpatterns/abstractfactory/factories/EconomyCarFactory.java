package creationaldesignpatterns.abstractfactory.factories;

import creationaldesignpatterns.abstractfactory.model.Car;
import creationaldesignpatterns.abstractfactory.model.EconomyCar1;
import creationaldesignpatterns.abstractfactory.model.EconomyCar2;

public class EconomyCarFactory implements VehicleFactory {
    @Override
    public Car getCar(int price, String owner) {
        if (price < 100000) {
            return new EconomyCar1(owner);
        } else {
            return new EconomyCar2(owner);
        }
    }
}
