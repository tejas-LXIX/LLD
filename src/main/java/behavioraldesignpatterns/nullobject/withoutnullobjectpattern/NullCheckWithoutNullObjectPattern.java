package behavioraldesignpatterns.nullobject.withoutnullobjectpattern;

public class NullCheckWithoutNullObjectPattern {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(5, 22);
        printVehicleDetails(vehicle);
        printVehicleDetails(null);
    }

    public static void printVehicleDetails(Vehicle vehicle) {
        //adding a null check here. this makes the code ugly and repetitive. this is the problem that the null object design pattern solves.
        if (vehicle != null) {
            System.out.println(vehicle.getSeats());
            System.out.println(vehicle.getFuel());
        }
    }
}
