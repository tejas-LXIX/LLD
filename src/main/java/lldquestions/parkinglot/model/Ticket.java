package lldquestions.parkinglot.model;

import lldquestions.parkinglot.model.parkingslot.ParkingSlot;

import java.util.Date;

public class Ticket {
    private final Date entryTime;

    private final ParkingSlot parkingSlot;

    public Ticket(Date entryTime, ParkingSlot parkingSlot) {
        this.entryTime = entryTime;
        this.parkingSlot = parkingSlot;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "entryTime=" + entryTime +
                ", parkingSlotId=" + parkingSlot.getId() +
                ", parkingSlotVehicleNumber=" + parkingSlot.getVehicle().getNumber() +
                ", parkingSlotVehicleType=" + parkingSlot.getVehicle().getType() +
                '}';
    }
}
