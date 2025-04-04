package lldquestions.splitwise.expense;

import lldquestions.splitwise.expense.split.Split;
import lldquestions.splitwise.user.User;

import java.util.List;

public class Expense {

    private String id;

    private String description;

    private double amount;

    private User payer;

    ExpenseSplitType expenseSplitType;

    private List<Split> splits;

    public Expense(String id, String description, double amount, User payer, ExpenseSplitType expenseSplitType, List<Split> splits) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.payer = payer;
        this.expenseSplitType = expenseSplitType;
        this.splits = splits;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public User getPayer() {
        return payer;
    }

    public void setPayer(User payer) {
        this.payer = payer;
    }

    public ExpenseSplitType getExpenseSplitType() {
        return expenseSplitType;
    }

    public void setExpenseSplitType(ExpenseSplitType expenseSplitType) {
        this.expenseSplitType = expenseSplitType;
    }

    public List<Split> getSplits() {
        return splits;
    }

    public void setSplits(List<Split> splits) {
        this.splits = splits;
    }
}
