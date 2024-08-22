package creationaldesignpatterns.abstractfactory.factories;

import creationaldesignpatterns.abstractfactory.model.Car;

public interface VehicleFactory {
    public Car getCar(int price, String owner);
}
