package behavioraldesignpatterns.strategy.withoutstrategypattern;

//PaymentService does something specific (charge the customer) in a lot of different ways. Therefore, this is suitable for strategy pattern.
public class PaymentService {
    private int cost;
    private boolean includeDelivery;

    //this code violates open/closed principle. because whenever a change is required (like adding a new payment method), we are going to have to modify this method.
    //this code violates the single responsibility principle, because it handles payments from both Credit card and Paypal.
    //therefore, we need to place each payment method in it's own class that is responsible for a particular payment strategy.
    //These strategy classes should be interchangeable with each other.
    public void processOrder(String paymentMethod) {
        if ("CreditCard".equals(paymentMethod)) {
            CreditCard card = new CreditCard("1234", "01/28", "043");
            System.out.println("Paying " + getTotal() + " using credit card");
            card.setAmount(card.getAmount() - getTotal());
        } else if ("Paypal".equals(paymentMethod)) {
            String email = "tejas";
            String password = "abcd";
            System.out.println("Paying " + getTotal() + " using Paypal");
        }
    }
    private int getTotal() {
        return includeDelivery ? cost + 10 : cost;
    }
}
