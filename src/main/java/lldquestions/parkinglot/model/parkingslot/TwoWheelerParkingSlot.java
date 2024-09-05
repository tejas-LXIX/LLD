package lldquestions.parkinglot.model.parkingslot;

import lldquestions.parkinglot.model.vehicle.VehicleType;

public class TwoWheelerParkingSlot extends ParkingSlot {

    public TwoWheelerParkingSlot(int id) {
        super(id, VehicleType.TWO_WHEELER);
    }

    @Override
    public int getPrice() {
        return 10;
    }
}
