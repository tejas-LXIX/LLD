package lldquestions.parkinglot.model.costcomputation;

import lldquestions.parkinglot.Ticket;
import lldquestions.parkinglot.model.parkingslot.ParkingSlot;

public interface CostComputation {

    int calculateCost(Ticket ticket, ParkingSlot parkingSlot);

}
