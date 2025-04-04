package lldquestions.splitwise.expense.split;

import java.util.List;

public class EqualExpenseSplit implements ExpenseSplit {
    @Override
    public void validateSplitRequest(List<Split> splits, double amount) {

    }

    @Override
    public void overrideSplitAmounts(List<Split> splits, double amount) {
        int numberOfSplits = splits.size();
        double individualAmount = amount/numberOfSplits;
        splits.forEach(split -> split.setAmount(individualAmount));
    }
}
