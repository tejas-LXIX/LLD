package lldquestions.atm.state;

import lldquestions.atm.ATM;
import lldquestions.atm.model.Card;
import lldquestions.atm.model.Notes;
import lldquestions.atm.model.OperationType;

import java.util.List;

public class CashWithdrawalState extends ATMState {

    @Override
    public void insertCard(ATM atm, Card card) throws Exception {
        System.out.println("Action not allowed in this state. Only withdrawal is allowed");
    }

    @Override
    public void authenticate(ATM atm, Card card, String pin) throws Exception {
        System.out.println("Action not allowed in this state. Only withdrawal is allowed");
    }

    @Override
    public void selectOperation(ATM atm, OperationType operationType) throws Exception {
        System.out.println("Action not allowed in this state. Only withdrawal is allowed");
    }

    @Override
    public void withdraw(ATM atm, Card card, int amount) throws Exception {
        if (atm.getAtmBalance() < amount) {
            System.out.println("Insufficient fund in the ATM Machine");
            exit(atm);
        } else if (card.getAccount().getBalance() < amount) {
            System.out.println("Insufficient fund in the your Bank Account");
            exit(atm);
        } else {
            boolean withdrawedSuccessfully = atm.withdraw(amount);
            if (withdrawedSuccessfully) {
                card.getAccount().deductBalance(amount);
                System.out.println("Amount " + amount + " was withdrawn successfully");
            } else {
                System.out.println("Not enough notes of the right type to complete the withdrawal, even though funds are present in both ATM and account. Not deducting amount from account balance");
            }
        }
        exit(atm);
    }

    @Override
    public void deposit(ATM atm, Card card, List<Notes> notes) throws Exception {
        System.out.println("Action not allowed in this state. Only withdrawal is allowed");
    }

    @Override
    public void checkBalance(ATM atm, Card card) throws Exception {
        System.out.println("Action not allowed in this state. Only withdrawal is allowed");
    }
}
