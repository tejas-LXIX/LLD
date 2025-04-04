package lldquestions.splitwise.group;

import lldquestions.splitwise.expense.Expense;
import lldquestions.splitwise.expense.ExpenseController;
import lldquestions.splitwise.expense.ExpenseSplitType;
import lldquestions.splitwise.expense.split.Split;
import lldquestions.splitwise.user.User;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private String id;

    private String name;

    private List<User> users;

    private List<Expense> expenseList;

    private ExpenseController expenseController;

    Group() {
        users = new ArrayList<>();
        expenseList = new ArrayList<>();
        expenseController = new ExpenseController();
    }

    public void addMember(User member) {
        users.add(member);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Expense createExpense(String expenseId, String description, double expenseAmount,
                                 List<Split> splitDetails, ExpenseSplitType splitType, User paidByUser) throws Exception {
        Expense expense = expenseController.createExpense(expenseId, description, expenseAmount, splitDetails, splitType, paidByUser);
        expenseList.add(expense);
        return expense;
    }
}
