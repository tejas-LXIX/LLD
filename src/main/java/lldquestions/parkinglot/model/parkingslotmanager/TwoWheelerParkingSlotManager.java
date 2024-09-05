package lldquestions.parkinglot.model.parkingslotmanager;

import lldquestions.parkinglot.model.parkingslot.ParkingSlot;
import lldquestions.parkinglot.model.parkingstrategy.ParkingStrategy;

import java.util.List;

public class TwoWheelerParkingSlotManager extends ParkingSlotManager {

    public TwoWheelerParkingSlotManager(List<ParkingSlot> parkingSlotList, ParkingStrategy parkingStrategy) {
        super(parkingSlotList, parkingStrategy);
    }

}
