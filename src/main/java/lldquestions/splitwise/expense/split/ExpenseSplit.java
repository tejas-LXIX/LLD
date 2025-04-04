package lldquestions.splitwise.expense.split;

import java.util.List;

public interface ExpenseSplit {

    public void validateSplitRequest(List<Split> splits, double amount) throws Exception;

    public void overrideSplitAmounts(List<Split> splits, double amount);

}
