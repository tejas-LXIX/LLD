package behavioraldesignpatterns.nullobject.withnullobjectpattern;

public class Car implements Vehicle {
    @Override
    public int getSeats() {
        return 5;
    }

    @Override
    public int getFuel() {
        return 22;
    }
}
