package lldquestions.atm.withdrawalprocessors;

import lldquestions.atm.ATM;
import lldquestions.atm.model.NoteType;
import lldquestions.atm.model.Notes;

public class TwoThousandWithdrawalProcessor extends WithdrawalProcessor {

    public TwoThousandWithdrawalProcessor(WithdrawalProcessor withdrawalProcessor) {
        super(withdrawalProcessor);
    }

    @Override
    public boolean withdraw(ATM atm, int amount) {
        Notes notes = atm.getNotesList().stream().filter(notes1 -> notes1.getNoteType().equals(NoteType.TWO_THOUSAND)).findAny().orElse(null);
        int required =  amount/2000;
        int remainingAmount = amount%2000;

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
                remainingAmount = remainingAmount + diff * 2000;
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
