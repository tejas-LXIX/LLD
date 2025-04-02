package lldquestions.parkinglot.model.gate;

import lldquestions.parkinglot.Ticket;
import lldquestions.parkinglot.model.parkingslot.ParkingSlot;

public abstract class ExitGate {

    public void leave(Ticket ticket) {
        ParkingSlot parkingSlot = getParkingSlot(ticket);
        int cost = calculateCost(ticket, parkingSlot);
        System.out.println("The cost is: " + cost);
        freeParkingSlot(parkingSlot);
        System.out.println("The vehicle " + ticket.getVehicleNumber() + " has successfully exited the parking lot");
    }

    abstract int calculateCost(Ticket ticket, ParkingSlot parkingSlot);

    abstract void freeParkingSlot(ParkingSlot parkingSlot);

    abstract ParkingSlot getParkingSlot(Ticket ticket);
}