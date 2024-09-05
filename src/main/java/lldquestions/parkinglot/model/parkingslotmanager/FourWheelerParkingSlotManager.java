package lldquestions.parkinglot.model.parkingslotmanager;

import lldquestions.parkinglot.model.parkingslot.ParkingSlot;
import lldquestions.parkinglot.model.parkingstrategy.ParkingStrategy;

import java.util.List;

public class FourWheelerParkingSlotManager extends ParkingSlotManager {

    public FourWheelerParkingSlotManager(List<ParkingSlot> parkingSlotList, ParkingStrategy parkingStrategy) {
        super(parkingSlotList, parkingStrategy);
    }

}
