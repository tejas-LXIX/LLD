package lldquestions.parkinglot.model.gate;

import lldquestions.parkinglot.Ticket;
import lldquestions.parkinglot.model.costcomputation.CostComputation;
import lldquestions.parkinglot.model.costcomputation.CostComputationFactory;
import lldquestions.parkinglot.model.parkingslot.ParkingSlot;
import lldquestions.parkinglot.model.parkingslotmanager.ParkingSlotManager;
import lldquestions.parkinglot.model.parkingslotmanager.ParkingSlotManagerFactory;

public class ExitGateImpl extends ExitGate {

    ParkingSlotManagerFactory parkingSlotManagerFactory;

    CostComputationFactory costComputationFactory;

    public ExitGateImpl() {
        parkingSlotManagerFactory = ParkingSlotManagerFactory.getInstance();
        costComputationFactory = CostComputationFactory.getInstance();
    }

    @Override
    int calculateCost(Ticket ticket, ParkingSlot parkingSlot) {
        CostComputation costComputation = costComputationFactory.getCostComputation(ticket.getVehicleType());
        return costComputation.calculateCost(ticket, parkingSlot);
    }

    @Override
    void freeParkingSlot(ParkingSlot parkingSlot) {
        ParkingSlotManager parkingSlotManager = parkingSlotManagerFactory.getParkingSlotManager(parkingSlot.getVehicleType());
        parkingSlotManager.removeVehicle(parkingSlot);
    }

    @Override
    ParkingSlot getParkingSlot(Ticket ticket) {
        ParkingSlotManager parkingSlotManager = parkingSlotManagerFactory.getParkingSlotManager(ticket.getVehicleType());
        return parkingSlotManager.findParkingSlotWithId(ticket.getParkingSlotId());
    }
}
