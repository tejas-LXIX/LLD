package structuraldesignpatterns.adapterdesignpattern.adaptee;

public class WeightMachineImpl implements WeightMachine {
    @Override
    public int getWeightInPounds() {
        return 30;
    }
}
