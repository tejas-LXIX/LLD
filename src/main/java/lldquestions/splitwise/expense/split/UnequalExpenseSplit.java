package lldquestions.splitwise.expense.split;

import java.util.List;

public class UnequalExpenseSplit implements ExpenseSplit {
    @Override
    public void validateSplitRequest(List<Split> splits, double amount) throws Exception {
        double calculatedAmount = splits.stream().map(Split::getAmount).mapToDouble(d -> d).sum();
        if (calculatedAmount != amount) {
            throw new Exception("calculatedAmount is not equal to amount");
        }
    }

    @Override
    public void overrideSplitAmounts(List<Split> splits, double amount) {

    }
}
