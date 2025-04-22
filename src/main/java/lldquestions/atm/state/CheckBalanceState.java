package lldquestions.atm.state;

import lldquestions.atm.ATM;
import lldquestions.atm.model.Card;
import lldquestions.atm.model.Notes;
import lldquestions.atm.model.OperationType;

import java.util.List;

public class CheckBalanceState extends ATMState {

    @Override
    public void insertCard(ATM atm, Card card) throws Exception {
        System.out.println("Action not allowed in this state. Only checkBalance is allowed");
    }

    @Override
    public void authenticate(ATM atm, Card card, String pin) throws Exception {
        System.out.println("Action not allowed in this state. Only checkBalance is allowed");
    }

    @Override
    public void selectOperation(ATM atm, OperationType operationType) throws Exception {
        System.out.println("Action not allowed in this state. Only checkBalance is allowed");
    }

    @Override
    public void withdraw(ATM atm, Card card, int amount) throws Exception {
        System.out.println("Action not allowed in this state. Only checkBalance is allowed");
    }

    @Override
    public void deposit(ATM atm, Card card, List<Notes> notes) throws Exception {
        System.out.println("Action not allowed in this state. Only checkBalance is allowed");
    }

    @Override
    public void checkBalance(ATM atm, Card card) throws Exception {
        System.out.println(card.getAccount().getBalance());
        atm.setAtmState(new IdleState());
    }
}
