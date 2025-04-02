package lldquestions.parkinglot.model.costcomputation;

import lldquestions.parkinglot.model.vehicle.VehicleType;

import java.util.HashMap;
import java.util.Map;

public class CostComputationFactory {

    private static CostComputationFactory costComputationFactory;

    private final Map<VehicleType, CostComputation> costComputers = new HashMap<>();

    public static CostComputationFactory getInstance() {
        if (costComputationFactory == null) {
            synchronized (CostComputationFactory.class) {
                if (costComputationFactory == null) {
                    costComputationFactory = new CostComputationFactory();
                }
            }
        }
        return costComputationFactory;
    }

    private CostComputationFactory() {
        costComputers.put(VehicleType.TWO_WHEELER, new MinuteCost());
        costComputers.put(VehicleType.FOUR_WHEELER, new HourlyCost());
    }

    public CostComputation getCostComputation(VehicleType vehicleType) {
        return costComputers.get(vehicleType);
    }


}
