package behavioraldesignpatterns.strategy.withstrategypattern;

public class PaymentByPaypal implements PaymentStrategy {
    private String email;
    private String password;

    @Override
    public void collectPaymentDetails() {
        email = "tejas";
        password = "abcd";
    }

    @Override
    public boolean validatePaymentDetails() {
        //validate the account.
        return true;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using Paypal");
    }
}
