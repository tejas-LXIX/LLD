package lldquestions.atm.state;

import lldquestions.atm.ATM;
import lldquestions.atm.model.Card;
import lldquestions.atm.model.Notes;
import lldquestions.atm.model.OperationType;

import java.util.List;

public class SelectOperationState extends ATMState {

    @Override
    public void insertCard(ATM atm, Card card) throws Exception {
        System.out.println("Action not allowed in this state. Only selectoperation is allowed");
    }

    @Override
    public void authenticate(ATM atm, Card card, String pin) throws Exception {
        System.out.println("Action not allowed in this state. Only selectoperation is allowed");
    }

    @Override
    public void selectOperation(ATM atm, OperationType operationType) throws Exception {
        switch (operationType) {
            case WITHDRAWAL:
                atm.setAtmState(new CashWithdrawalState());
                break;
            case DEPOSIT:
                atm.setAtmState(new CashDepositState());
                break;
            case CHECK_BALANCE:
                atm.setAtmState(new CheckBalanceState());
                break;
            default:
                System.out.println("Invalid Option");
                exit(atm);
        }
    }

    @Override
    public void withdraw(ATM atm, Card card, int amount) throws Exception {
        System.out.println("Action not allowed in this state. Only selectoperation is allowed");
    }

    @Override
    public void deposit(ATM atm, Card card, List<Notes> notes) throws Exception {
        System.out.println("Action not allowed in this state. Only selectoperation is allowed");
    }

    @Override
    public void checkBalance(ATM atm, Card card) throws Exception {
        System.out.println("Action not allowed in this state. Only selectoperation is allowed");
    }
}
