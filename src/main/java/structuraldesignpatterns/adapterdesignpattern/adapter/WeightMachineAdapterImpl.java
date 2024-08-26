package structuraldesignpatterns.adapterdesignpattern.adapter;

import structuraldesignpatterns.adapterdesignpattern.adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {
    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKG() {
        int weightInPounds = weightMachine.getWeightInPounds();
        return weightInPounds*.45;
    }
}
