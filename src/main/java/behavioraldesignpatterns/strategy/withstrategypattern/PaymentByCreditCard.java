package behavioraldesignpatterns.strategy.withstrategypattern;

import behavioraldesignpatterns.strategy.withoutstrategypattern.CreditCard;

public class PaymentByCreditCard implements PaymentStrategy {
    private CreditCard card;

    @Override
    public void collectPaymentDetails() {
        //pop-up to collect payment details
        card = new CreditCard("1234", "01/28", "043");
    }

    @Override
    public boolean validatePaymentDetails() {
        //validate the card.
        return true;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using credit card");
        card.setAmount(card.getAmount() - amount);
    }
}
