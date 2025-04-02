package lldquestions.parkinglot.model.gate;

import lldquestions.parkinglot.Ticket;
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
        ParkingSlotManager parkingSlotManager = parkingSlotManagerFactory.getParkingSlotManager(vehicle.getType());
        return parkingSlotManager.parkVehicle(vehicle);
    }

    @Override
    protected void leaveParkingSlot(ParkingSlot parkingSlot) {
        ParkingSlotManager parkingSlotManager = parkingSlotManagerFactory.getParkingSlotManager(parkingSlot.getVehicle().getType());
        parkingSlotManager.removeVehicle(parkingSlot);
    }

    @Override
    public Ticket generateTicket(Vehicle vehicle, ParkingSlot parkingSlot) {
        return new Ticket(new Date(), vehicle.getNumber(), vehicle.getType(), parkingSlot.getId());
    }

    @Override
    protected ParkingSlot findParkingSlotForParkedVehicle(Vehicle vehicle) {
        ParkingSlotManager parkingSlotManager = parkingSlotManagerFactory.getParkingSlotManager(vehicle.getType());
        return parkingSlotManager.findParkingSlotForParkedVehicle(vehicle);
    }
}
