package lldquestions.splitwise.expense;

import lldquestions.splitwise.expense.split.Split;
import lldquestions.splitwise.balance.BalanceSheetController;
import lldquestions.splitwise.expense.split.ExpenseSplit;
import lldquestions.splitwise.user.User;

import java.util.List;

public class ExpenseController {

    SplitFactory splitFactory;

    BalanceSheetController balanceSheetController;

    public ExpenseController() {
        splitFactory = SplitFactory.getInstance();
        balanceSheetController = new BalanceSheetController();
    }

    public Expense createExpense(String expenseId, String description, double expenseAmount,
                                 List<Split> splitDetails, ExpenseSplitType expenseSplitType, User paidByUser) throws Exception {
        ExpenseSplit expenseSplit = splitFactory.getExpenseSplit(expenseSplitType);
        expenseSplit.validateSplitRequest(splitDetails, expenseAmount);
        expenseSplit.overrideSplitAmounts(splitDetails, expenseAmount);

        Expense expense = new Expense(expenseId, description, expenseAmount, paidByUser, expenseSplitType, splitDetails);

        balanceSheetController.updateUserExpenseBalanceSheet(expense);

        return expense;
    }

}
