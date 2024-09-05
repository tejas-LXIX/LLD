package lldquestions.parkinglot.model.parkingstrategy;

import lldquestions.parkinglot.model.parkingslot.ParkingSlot;

public interface ParkingStrategy {
    ParkingSlot assignAndRemoveParkingSlot();
    void addParkingSlot(ParkingSlot parkingSlot);
}
