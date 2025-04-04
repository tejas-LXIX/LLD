package lldquestions.splitwise.expense.split;

import java.util.List;

public class PercentageExpenseSplit implements ExpenseSplit {
    @Override
    public void validateSplitRequest(List<Split> splits, double amount) throws Exception {
        double calculatedPercentage = splits.stream().map(Split::getPercentage).mapToDouble(d -> d).sum();
        if (calculatedPercentage != 100) {
            throw new Exception("calculatedPercentage is not equal to 100");
        }
    }

    @Override
    public void overrideSplitAmounts(List<Split> splits, double amount) {
        splits.forEach(split -> {
            double individualAmount = amount * split.getPercentage();
            split.setAmount(individualAmount);
        });
    }
}
