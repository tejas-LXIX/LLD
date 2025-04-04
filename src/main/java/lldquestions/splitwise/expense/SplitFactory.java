package lldquestions.splitwise.expense;

import lldquestions.splitwise.expense.split.EqualExpenseSplit;
import lldquestions.splitwise.expense.split.ExpenseSplit;
import lldquestions.splitwise.expense.split.PercentageExpenseSplit;
import lldquestions.splitwise.expense.split.UnequalExpenseSplit;

import java.util.HashMap;
import java.util.Map;

public class SplitFactory {
    private static SplitFactory splitFactory;

    private final Map<ExpenseSplitType, ExpenseSplit> splitTypes = new HashMap<>();

    public static SplitFactory getInstance() {
        if (splitFactory == null) {
            synchronized (SplitFactory.class) {
                if (splitFactory == null) {
                    splitFactory = new SplitFactory();
                }
            }
        }
        return splitFactory;
    }

    private SplitFactory() {
        splitTypes.put(ExpenseSplitType.EQUAL, new EqualExpenseSplit());
        splitTypes.put(ExpenseSplitType.UNEQUAL, new UnequalExpenseSplit());
        splitTypes.put(ExpenseSplitType.PERCENTAGE, new PercentageExpenseSplit());
    }

    public ExpenseSplit getExpenseSplit(ExpenseSplitType splitType) {
        return splitTypes.get(splitType);
    }

}
