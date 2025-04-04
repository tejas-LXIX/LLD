package lldquestions.splitwise.user;

import lldquestions.splitwise.balance.BalanceSheet;

public class User {

    private String id;

    private String name;

    private BalanceSheet balanceSheet;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
        balanceSheet = new BalanceSheet();
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

    public BalanceSheet getBalanceSheet() {
        return balanceSheet;
    }

    public void setBalanceSheet(BalanceSheet balanceSheet) {
        this.balanceSheet = balanceSheet;
    }
}
