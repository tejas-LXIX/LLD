package lldquestions.parkinglot.model.gate;

import lldquestions.parkinglot.model.parkingslot.ParkingSlot;

public interface ExitGate {
    int calculateCost();

    void pay();

    void updateParkingSlot(ParkingSlot parkingSlot);
}