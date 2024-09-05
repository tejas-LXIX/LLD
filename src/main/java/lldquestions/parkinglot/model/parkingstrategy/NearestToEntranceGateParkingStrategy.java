package lldquestions.parkinglot.model.parkingstrategy;

import lldquestions.parkinglot.model.parkingslot.ParkingSlot;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class NearestToEntranceGateParkingStrategy implements ParkingStrategy {

    TreeSet<ParkingSlot> slots;

    public NearestToEntranceGateParkingStrategy(List<ParkingSlot> parkingSlots) {
        slots = new TreeSet<>(Comparator.comparingInt(ParkingSlot::getId));
        this.slots.addAll(parkingSlots);
    }

    @Override
    public ParkingSlot assignAndRemoveParkingSlot() {
        return slots.pollFirst();
    }

    @Override
    public void addParkingSlot(ParkingSlot parkingSlot) {
        slots.add(parkingSlot);
    }
}
