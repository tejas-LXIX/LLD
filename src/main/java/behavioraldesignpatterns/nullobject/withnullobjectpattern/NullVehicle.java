package behavioraldesignpatterns.nullobject.withnullobjectpattern;

public class NullVehicle implements Vehicle {

    //default behaviour. returns 0.
    @Override
    public int getSeats() {
        return 0;
    }

    @Override
    public int getFuel() {
        return 0;
    }
}
