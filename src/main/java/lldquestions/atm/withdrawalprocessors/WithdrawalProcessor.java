package lldquestions.atm.withdrawalprocessors;

import lldquestions.atm.ATM;

public abstract class WithdrawalProcessor {
    WithdrawalProcessor nextProcessor;

    public WithdrawalProcessor(WithdrawalProcessor withdrawalProcessor) {
        this.nextProcessor = withdrawalProcessor;
    }

    public boolean withdraw(ATM atm, int amount) {
        if(nextProcessor != null) {
            return nextProcessor.withdraw(atm, amount);
        }
        return amount == 0;
    }
}
