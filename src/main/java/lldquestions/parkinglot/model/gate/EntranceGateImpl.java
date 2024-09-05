package lldquestions.parkinglot.model.gate;

import lldquestions.parkinglot.model.Ticket;
import lldquestions.parkinglot.model.parkingslot.ParkingSlot;
import lldquestions.parkinglot.model.parkingslotmanager.ParkingSlotManager;
import lldquestions.parkinglot.model.parkingslotmanager.ParkingSlotManagerFactory;
import lldquestions.parkinglot.model.vehicle.Vehicle;

import java.util.Date;

public class EntranceGateImpl extends EntranceGate {

    ParkingSlotManagerFactory parkingSlotManagerFactory;

    public EntranceGateImpl() {
        parkingSlotManagerFactory = ParkingSlotManagerFactory.getInstance();
    }

    @Override
    public ParkingSlot bookParkingSlot(Vehicle vehicle) {
        ParkingSlotManager parkingSlotManager = parkingSlotManagerFactory.getParkingSlotManager(vehicle);
        return parkingSlotManager.parkVehicle(vehicle);
    }

    @Override
    protected void leaveParkingSlot(ParkingSlot parkingSlot) {
        ParkingSlotManager parkingSlotManager = parkingSlotManagerFactory.getParkingSlotManager(parkingSlot.getVehicle());
        parkingSlotManager.removeVehicle(parkingSlot);
    }

    @Override
    public Ticket generateTicket(ParkingSlot parkingSlot) {
        return new Ticket(new Date(), parkingSlot);
    }

    @Override
    protected ParkingSlot findParkingSlotForParkedVehicle(Vehicle vehicle) {
        ParkingSlotManager parkingSlotManager = parkingSlotManagerFactory.getParkingSlotManager(vehicle);
        return parkingSlotManager.findParkingSlotForParkedVehicle(vehicle);
    }
}
