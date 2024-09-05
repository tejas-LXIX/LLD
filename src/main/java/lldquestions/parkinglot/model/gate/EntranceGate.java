package lldquestions.parkinglot.model.gate;

import lldquestions.parkinglot.model.Ticket;
import lldquestions.parkinglot.model.parkingslot.ParkingSlot;
import lldquestions.parkinglot.model.vehicle.Vehicle;

public abstract class EntranceGate {

    protected abstract ParkingSlot bookParkingSlot(Vehicle vehicle);

    protected abstract void leaveParkingSlot(ParkingSlot parkingSlot);

    protected abstract Ticket generateTicket(ParkingSlot parkingSlot);

    protected abstract ParkingSlot findParkingSlotForParkedVehicle(Vehicle vehicle);

    public final Ticket parkVehicleAndGetTicket(Vehicle vehicle) {
        ParkingSlot parkingSlot = bookParkingSlot(vehicle);
        return generateTicket(parkingSlot);
    }

    public final void leave(Vehicle vehicle) {
        ParkingSlot parkingSlot = findParkingSlotForParkedVehicle(vehicle);
        leaveParkingSlot(parkingSlot);
    }
}