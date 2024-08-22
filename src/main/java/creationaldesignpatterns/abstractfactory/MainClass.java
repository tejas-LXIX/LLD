package creationaldesignpatterns.abstractfactory;

import creationaldesignpatterns.abstractfactory.factories.VehicleFactory;
import creationaldesignpatterns.abstractfactory.factories.VehicleFactoryProducer;

//FACTORY OF FACTORY
//this is primarily used in CCA to get the required connector first. Then, using that connector, we get the required service. So, factory of factory.
public class MainClass {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = VehicleFactoryProducer.getFactory("Economy");
        assert vehicleFactory != null;
        System.out.println(vehicleFactory.getCar(20000,"tejas").getTopSpeed());
        System.out.println(vehicleFactory.getCar(200000,"kashish").getTopSpeed());
        vehicleFactory = VehicleFactoryProducer.getFactory("Luxury");
        assert vehicleFactory != null;
        System.out.println(vehicleFactory.getCar(1000010,"tejas").getTopSpeed());
        System.out.println(vehicleFactory.getCar(120000120,"kashish").getTopSpeed());
    }
}
