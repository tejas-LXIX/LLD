package lldquestions.atm.state;

import lldquestions.atm.ATM;
import lldquestions.atm.model.Card;
import lldquestions.atm.model.Notes;
import lldquestions.atm.model.OperationType;

import java.util.List;

public class IdleState extends ATMState {
    @Override
    public void insertCard(ATM atm, Card card) throws Exception {
        System.out.println("Card is inserted");
        atm.setAtmState(new HasCardState());
    }

    @Override
    public void authenticate(ATM atm, Card card, String pin) throws Exception {
        System.out.println("Action not allowed in this state. Only insertCard is allowed");
    }

    @Override
    public void selectOperation(ATM atm, OperationType operationType) throws Exception {
        System.out.println("Action not allowed in this state. Only insertCard is allowed");
    }

    @Override
    public void withdraw(ATM atm, Card card, int amount) throws Exception {
        System.out.println("Action not allowed in this state. Only insertCard is allowed");
    }

    @Override
    public void deposit(ATM atm, Card card, List<Notes> notes) throws Exception {
        System.out.println("Action not allowed in this state. Only insertCard is allowed");
    }

    @Override
    public void checkBalance(ATM atm, Card card) throws Exception {
        System.out.println("Action not allowed in this state. Only insertCard is allowed");
    }
}
