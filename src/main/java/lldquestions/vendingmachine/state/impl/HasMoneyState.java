package lldquestions.vendingmachine.state.impl;

import lldquestions.vendingmachine.VendingMachine;
import lldquestions.vendingmachine.model.Coin;
import lldquestions.vendingmachine.model.Item;
import lldquestions.vendingmachine.state.State;

import java.util.ArrayList;
import java.util.List;

public class HasMoneyState implements State {

    public HasMoneyState(){
        System.out.println("Currently Vending machine is in HasMoneyState");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        return;
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new SelectionState());
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        System.out.println("Accepted the coin");
        machine.getCoinList().add(coin);
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int codeNo) throws Exception {
        throw new Exception("you need to click on start product selection button first");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("you cannot get change in hasMoney state. please move to the SelectionState().");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNo) throws Exception {
        throw new Exception("product can not be dispensed in hasMoney state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        List<Coin> coinList = new ArrayList<>(machine.getCoinList());
        machine.setVendingMachineState(new IdleState(machine));
        return coinList;
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNo) throws Exception {
        throw new Exception("you can not update inventory in hasMoney  state");
    }
}
