package behavioraldesignpatterns.strategy.withstrategypattern;

public interface PaymentStrategy {
    void collectPaymentDetails();
    boolean validatePaymentDetails();
    void pay(int amount);
}
