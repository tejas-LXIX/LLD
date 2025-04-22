package lldquestions.atm.withdrawalprocessors;

import lldquestions.atm.ATM;
import lldquestions.atm.model.NoteType;
import lldquestions.atm.model.Notes;

public class OneHundredWithdrawalProcessor extends WithdrawalProcessor {

    public OneHundredWithdrawalProcessor(WithdrawalProcessor withdrawalProcessor) {
        super(withdrawalProcessor);
    }

    @Override
    public boolean withdraw(ATM atm, int amount) {
        Notes notes = atm.getNotesList().stream().filter(notes1 -> notes1.getNoteType().equals(NoteType.ONE_HUNDRED)).findAny().orElse(null);
        int required =  amount/100;
        int remainingAmount = amount%100;

        if (notes != null) {
            if(required <= notes.getNumberOfNotes()) {
                if (super.withdraw(atm, remainingAmount)) {
                    notes.setNumberOfNotes(notes.getNumberOfNotes() - required);
                } else {
                    System.out.println("Sorry, request cannot be processed since we don't have enough notes of all types to process your request.");
                    return false;
                }
            }
            else if(required > notes.getNumberOfNotes()) {
                int diff = required-notes.getNumberOfNotes();
                remainingAmount = remainingAmount + diff * 100;
                if (super.withdraw(atm, remainingAmount)) {
                    notes.setNumberOfNotes(0);
                } else {
                    System.out.println("Sorry, request cannot be processed since we don't have enough notes of all types to process your request.");
                    return false;
                }
            }
            return true;
        } else {
            return super.withdraw(atm, amount);
        }
    }
}
