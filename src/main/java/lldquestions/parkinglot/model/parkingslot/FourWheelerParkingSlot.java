package lldquestions.parkinglot.model.parkingslot;

import lldquestions.parkinglot.model.vehicle.VehicleType;

public class FourWheelerParkingSlot extends ParkingSlot {

    public FourWheelerParkingSlot(int id) {
        super(id, VehicleType.FOUR_WHEELER);
    }

    @Override
    public int getPrice() {
        return 30;
    }
}
