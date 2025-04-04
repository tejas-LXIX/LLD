package lldquestions.splitwise.balance;

import lldquestions.splitwise.user.User;

import java.util.HashMap;
import java.util.Map;

public class BalanceSheet {

    private Map<User, Balance> userBalance;

    private double totalExpense;

    private double totalPaid;

    private double totalOwed;

    public BalanceSheet() {
        userBalance = new HashMap<>();
        totalExpense = 0;
        totalOwed = 0;
    }

    public Map<User, Balance> getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(Map<User, Balance> userBalance) {
        this.userBalance = userBalance;
    }

    public double getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(double totalExpense) {
        this.totalExpense = totalExpense;
    }

    public double getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(double totalPaid) {
        this.totalPaid = totalPaid;
    }

    public double getTotalOwed() {
        return totalOwed;
    }

    public void setTotalOwed(double totalOwed) {
        this.totalOwed = totalOwed;
    }
}
