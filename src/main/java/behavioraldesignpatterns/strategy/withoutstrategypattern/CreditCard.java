package behavioraldesignpatterns.strategy.withoutstrategypattern;

public class CreditCard {
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    private int amount;

    public CreditCard(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
