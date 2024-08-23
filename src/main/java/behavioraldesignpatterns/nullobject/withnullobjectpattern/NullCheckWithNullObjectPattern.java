package behavioraldesignpatterns.nullobject.withnullobjectpattern;

public class NullCheckWithNullObjectPattern {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicle("Bike");
        printVehicleDetails(vehicle);
    }

    public static void printVehicleDetails(Vehicle vehicle) {
        //null check is not required here anymore. because we are assured that we will never get null.
        System.out.println(vehicle.getSeats());
        System.out.println(vehicle.getFuel());
    }
}
