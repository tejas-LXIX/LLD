package structuraldesignpatterns.adapterdesignpattern;

import structuraldesignpatterns.adapterdesignpattern.adaptee.WeightMachineImpl;
import structuraldesignpatterns.adapterdesignpattern.adapter.WeightMachineAdapter;
import structuraldesignpatterns.adapterdesignpattern.adapter.WeightMachineAdapterImpl;

public class Client {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineImpl());

        //the client talks to the adapter.
        System.out.println(weightMachineAdapter.getWeightInKG());
    }
}
