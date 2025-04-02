package lldquestions.parkinglot.model.costcomputation;

import lldquestions.parkinglot.Ticket;
import lldquestions.parkinglot.model.parkingslot.ParkingSlot;

import java.util.Date;

public class HourlyCost implements CostComputation {
    final int MILLI_TO_HOUR = 1000 * 60 * 60;
    final int baseFee = 30;

    @Override
    public int calculateCost(Ticket ticket, ParkingSlot parkingSlot) {
        Date currentDate = new Date();
        Date entryDate = ticket.getEntryTime();
        int hours = (int) ((currentDate.getTime() - entryDate.getTime()) / MILLI_TO_HOUR);
        return baseFee + hours * parkingSlot.getPrice();
    }
}
