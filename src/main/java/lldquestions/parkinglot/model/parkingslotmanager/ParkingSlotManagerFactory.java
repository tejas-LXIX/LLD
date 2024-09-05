package lldquestions.parkinglot.model.parkingslotmanager;

import lldquestions.parkinglot.model.parkingslot.FourWheelerParkingSlot;
import lldquestions.parkinglot.model.parkingslot.ParkingSlot;
import lldquestions.parkinglot.model.parkingslot.TwoWheelerParkingSlot;
import lldquestions.parkinglot.model.parkingstrategy.NearestToEntranceGateParkingStrategy;
import lldquestions.parkinglot.model.vehicle.Vehicle;
import lldquestions.parkinglot.model.vehicle.VehicleType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingSlotManagerFactory {
    private static ParkingSlotManagerFactory parkingSlotManagerFactory;

    private static final Map<VehicleType, ParkingSlotManager> managers = new HashMap<>();

    public static ParkingSlotManagerFactory getInstance() {
        if (parkingSlotManagerFactory == null) {
            synchronized (ParkingSlotManagerFactory.class) {
                if (parkingSlotManagerFactory == null) {
                    parkingSlotManagerFactory = new ParkingSlotManagerFactory();
                }
            }
        }
        return parkingSlotManagerFactory;
    }

    private ParkingSlotManagerFactory() {
        List<ParkingSlot> twoWheelerParkingSlotList = new ArrayList<>();
        for (int i=1;i<=600;i++) {
            twoWheelerParkingSlotList.add(new TwoWheelerParkingSlot(i));
        }
        managers.put(VehicleType.TWO_WHEELER, new TwoWheelerParkingSlotManager(twoWheelerParkingSlotList, new NearestToEntranceGateParkingStrategy(twoWheelerParkingSlotList)));

        List<ParkingSlot> fourWheelerParkingSlotList = new ArrayList<>();
        for (int i=601;i<=1000;i++) {
            fourWheelerParkingSlotList.add(new FourWheelerParkingSlot(i));
        }
        managers.put(VehicleType.FOUR_WHEELER, new FourWheelerParkingSlotManager(fourWheelerParkingSlotList, new NearestToEntranceGateParkingStrategy(fourWheelerParkingSlotList)));
    }

    public ParkingSlotManager getParkingSlotManager(Vehicle vehicle) {
        return managers.get(vehicle.getType());
    }
}
