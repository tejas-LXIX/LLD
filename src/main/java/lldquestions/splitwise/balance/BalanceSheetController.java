package lldquestions.splitwise.balance;

import lldquestions.splitwise.expense.Expense;
import lldquestions.splitwise.expense.split.Split;
import lldquestions.splitwise.user.User;

import java.util.List;
import java.util.Map;

public class BalanceSheetController {

    public void updateUserExpenseBalanceSheet(Expense expense) {
        BalanceSheet payerBalanceSheet = expense.getPayer().getBalanceSheet();
        payerBalanceSheet.setTotalPaid(payerBalanceSheet.getTotalPaid() + expense.getAmount());

        List<Split> expenseSplits = expense.getSplits();
        expenseSplits.forEach(split -> updateBalanceSheets(expense, split));
    }

    private void updateBalanceSheets(Expense expense, Split split) {
        User payer = expense.getPayer();
        BalanceSheet payerBalanceSheet = payer.getBalanceSheet();
        double amountOwed = split.getAmount();

        User ower = split.getUser();
        BalanceSheet owerBalanceSheet = ower.getBalanceSheet();

        if (payer.equals(ower)) {
            payerBalanceSheet.setTotalExpense(payerBalanceSheet.getTotalExpense() + amountOwed);
        } else {
            //update balance sheet of payer to ower.
            payerBalanceSheet.setTotalOwed(payerBalanceSheet.getTotalOwed() - amountOwed);

            Balance payerToOwerBalance = payerBalanceSheet.getUserBalance().computeIfAbsent(ower, newOwer -> new Balance());
            payerToOwerBalance.setAmountOwed(payerToOwerBalance.getAmountOwed() - amountOwed);

            //update balance sheet of ower to payer.
            owerBalanceSheet.setTotalOwed(owerBalanceSheet.getTotalOwed() + amountOwed);
            owerBalanceSheet.setTotalExpense(owerBalanceSheet.getTotalExpense() + amountOwed);

            Balance owerToPayerBalance = owerBalanceSheet.getUserBalance().computeIfAbsent(payer, newPayer -> new Balance());
            owerToPayerBalance.setAmountOwed(owerToPayerBalance.getAmountOwed() + amountOwed);
        }
    }

    public void showBalanceSheetOfUser(User user) {
        System.out.println("---------------------------------------");

        System.out.println("Balance sheet of user : " + user.getId() + " name: " + user.getName());

        BalanceSheet balanceSheet =  user.getBalanceSheet();

        System.out.println("TotalYourExpense: " + balanceSheet.getTotalExpense());
        System.out.println("TotalYouOwe: " + balanceSheet.getTotalOwed());
        System.out.println("TotalPaymentMade: " + balanceSheet.getTotalPaid());
        for(Map.Entry<User, Balance> entry : balanceSheet.getUserBalance().entrySet()){

            String userID = entry.getKey().getId();
            Balance balance = entry.getValue();

            System.out.println("userID:" + userID + " YouOwe:" + balance.getAmountOwed());
        }

        System.out.println("---------------------------------------");



    }

}
