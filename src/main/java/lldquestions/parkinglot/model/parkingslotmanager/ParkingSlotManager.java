package lldquestions.parkinglot.model.parkingslotmanager;

import lldquestions.parkinglot.model.parkingslot.ParkingSlot;
import lldquestions.parkinglot.model.vehicle.Vehicle;
import lldquestions.parkinglot.model.parkingstrategy.ParkingStrategy;

import java.util.ArrayList;
import java.util.List;

public abstract class ParkingSlotManager {

    List<ParkingSlot> freeParkingSlots;

    List<ParkingSlot> occupiedParkingSlots = new ArrayList<>();

    ParkingStrategy parkingStrategy;

    public ParkingSlotManager(List<ParkingSlot> freeParkingSlots, ParkingStrategy parkingStrategy) {
        this.freeParkingSlots = freeParkingSlots;
        this.parkingStrategy = parkingStrategy;
    }

    public ParkingSlot findParkingSlot() {
        return parkingStrategy.assignAndRemoveParkingSlot();
    }

    public void addParkingSlot(ParkingSlot parkingSlot) {
        freeParkingSlots.add(parkingSlot);
        occupiedParkingSlots.remove(parkingSlot);
    }

    public void removeParkingSlot(ParkingSlot parkingSlot) {
        freeParkingSlots.remove(parkingSlot);
        occupiedParkingSlots.add(parkingSlot);
    }

    public ParkingSlot parkVehicle(Vehicle v) {
        ParkingSlot parkingSlot = findParkingSlot();
        parkingSlot.parkVehicle(v);
        removeParkingSlot(parkingSlot);
        return parkingSlot;
    }

    public void removeVehicle(ParkingSlot parkingSlot) {
        parkingStrategy.addParkingSlot(parkingSlot);
        parkingSlot.removeVehicle();
        addParkingSlot(parkingSlot);
    }

    public ParkingSlot findParkingSlotForParkedVehicle(Vehicle vehicle) {
        return occupiedParkingSlots.stream().filter(parkingSlot -> parkingSlot.getVehicle().getNumber().equals(vehicle.getNumber())).findFirst().get();
    }


}
