package behavioraldesignpatterns.strategy.withstrategypattern;

//this class has no visibility anymore on how the payment is being conducted, as it delegates the actual task to the strategy interface.
//this class won't change even if new payment strategies are added.
public class PaymentService {
    private int cost;
    private boolean includeDelivery;

    private PaymentStrategy paymentStrategy;

    public void processOrder() {
        paymentStrategy.collectPaymentDetails();
        if (paymentStrategy.validatePaymentDetails()) {
            paymentStrategy.pay(getTotal());
        }
    }

    private int getTotal() {
        return includeDelivery ? cost + 10 : cost;
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
