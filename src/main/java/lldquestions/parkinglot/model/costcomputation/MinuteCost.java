package lldquestions.parkinglot.model.costcomputation;

import lldquestions.parkinglot.Ticket;
import lldquestions.parkinglot.model.parkingslot.ParkingSlot;

import java.util.Date;

public class MinuteCost implements CostComputation {

    final int MILLI_TO_MINUTE = 1000 * 60;
    final int baseFee = 5;

    @Override
    public int calculateCost(Ticket ticket, ParkingSlot parkingSlot) {
        Date currentDate = new Date();
        Date entryDate = ticket.getEntryTime();
        int minutes = (int) ((currentDate.getTime() - entryDate.getTime()) / MILLI_TO_MINUTE);
        return baseFee + minutes * parkingSlot.getId();
    }
}
