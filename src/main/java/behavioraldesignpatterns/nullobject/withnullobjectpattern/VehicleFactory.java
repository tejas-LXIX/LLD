package behavioraldesignpatterns.nullobject.withnullobjectpattern;

public class VehicleFactory {
    static Vehicle getVehicle(String type) {
        if("Car".equals(type)) {
            return new Car();
        }
        return new NullVehicle();
    }
}
