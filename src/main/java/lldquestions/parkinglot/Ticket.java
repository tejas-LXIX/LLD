package lldquestions.parkinglot;

import lldquestions.parkinglot.model.vehicle.VehicleType;

import java.util.Date;

public class Ticket {
    private final Date entryTime;

    private final String vehicleNumber;

    private final VehicleType vehicleType;

    private final int parkingSlotId;

    public Ticket(Date entryTime, String vehicleNumber, VehicleType vehicleType, int parkingSlotId) {
        this.entryTime = entryTime;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.parkingSlotId = parkingSlotId;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public int getParkingSlotId() {
        return parkingSlotId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "entryTime=" + entryTime +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", vehicleType=" + vehicleType +
                ", parkingSlotId=" + parkingSlotId +
                '}';
    }
}
