package lldquestions.atm.model;

public class Account {

    private String id;
    private Card card;
    private int balance;

    public Account(String id) {
        this.id = id;
        balance = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public int getBalance() {
        return balance;
    }

    public void deductBalance(int deduction) {
        balance -= deduction;
    }

    public void addBalance(int addition) {
        balance += addition;
    }
}
