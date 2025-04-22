package lldquestions.atm.state;

import lldquestions.atm.ATM;
import lldquestions.atm.model.Card;
import lldquestions.atm.model.Notes;
import lldquestions.atm.model.OperationType;

import java.util.List;

public abstract class ATMState {

    public abstract void insertCard(ATM atm, Card card) throws Exception;

    public abstract void authenticate(ATM atm, Card card, String pin) throws Exception;

    public abstract void selectOperation(ATM atm, OperationType operationType) throws Exception;

    public abstract void withdraw(ATM atm, Card card, int amount) throws Exception;

    public abstract void deposit(ATM atm, Card card, List<Notes> notes) throws Exception;

    public abstract void checkBalance(ATM atm, Card card) throws Exception;

    public void returnCard() {
        System.out.println("Please collect your card");
    }

    public void exit(ATM atm) {
        returnCard();
        atm.setAtmState(new IdleState());
        System.out.println("Exited the atm successfully");
    }

}
