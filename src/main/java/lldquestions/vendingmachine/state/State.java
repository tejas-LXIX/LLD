package lldquestions.vendingmachine.state;

import lldquestions.vendingmachine.VendingMachine;
import lldquestions.vendingmachine.model.Coin;
import lldquestions.vendingmachine.model.Item;

import java.util.List;

public interface State {

    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception;

    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception;

    public void insertCoin(VendingMachine machine, Coin coin) throws Exception;

    public void chooseProduct(VendingMachine vendingMachine, int codeNo) throws Exception;

    public int getChange(int returnChangeMoney) throws Exception;

    public Item dispenseProduct(VendingMachine vendingMachine, int codeNo) throws Exception;

    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception;

    public void updateInventory(VendingMachine machine, Item item, int codeNo) throws Exception;

}
