package lldquestions.atm;

import lldquestions.atm.model.NoteType;
import lldquestions.atm.model.Notes;
import lldquestions.atm.state.ATMState;
import lldquestions.atm.state.IdleState;
import lldquestions.atm.withdrawalprocessors.FiveHundredWithdrawalProcessor;
import lldquestions.atm.withdrawalprocessors.OneHundredWithdrawalProcessor;
import lldquestions.atm.withdrawalprocessors.TwoThousandWithdrawalProcessor;
import lldquestions.atm.withdrawalprocessors.WithdrawalProcessor;

import java.util.ArrayList;
import java.util.List;

public class ATM {

    private static ATM atm;

    private int atmBalance;
    private List<Notes> notesList;
    private ATMState atmState;

    private ATM() {
        notesList = new ArrayList<>();
        atmState = new IdleState();
        atmBalance = 10000;
        Notes notes = new Notes(NoteType.TWO_THOUSAND, 3);
        Notes notes1 = new Notes(NoteType.FIVE_HUNDRED, 6);
        Notes notes2 = new Notes(NoteType.ONE_HUNDRED, 10);
        notesList.add(notes);
        notesList.add(notes1);
        notesList.add(notes2);
    }

    public static ATM getInstance() {
        if (atm == null) {
            synchronized (ATM.class) {
                if (atm == null) {
                    atm = new ATM();
                }
            }
        }
        return atm;
    }

    public int getAtmBalance() {
        return atmBalance;
    }

    public ATMState getAtmState() {
        return atmState;
    }

    public void setAtmBalance(int atmBalance) {
        this.atmBalance = atmBalance;
    }

    public void setAtmState(ATMState atmState) {
        this.atmState = atmState;
    }

    public List<Notes> getNotesList() {
        return notesList;
    }

    public void addAtmBalance(List<Notes> addedNotes) {
        int addedMoney = addedNotes.stream().map(notes -> notes.getNoteType().getValue() * notes.getNumberOfNotes()).reduce(0, Integer::sum);
        atmBalance += addedMoney;
        notesList.addAll(addedNotes);
        System.out.println("Amount " + addedMoney + " was deposited successfully");
    }

    public void deductAtmBalance(int amount) {
        atmBalance -= amount;
    }

    public boolean withdraw(int amount) {
        // chain of responsibility
        WithdrawalProcessor withdrawProcessor = new TwoThousandWithdrawalProcessor(new FiveHundredWithdrawalProcessor(new OneHundredWithdrawalProcessor(null)));
        return withdrawProcessor.withdraw(this, amount);
    }

}
