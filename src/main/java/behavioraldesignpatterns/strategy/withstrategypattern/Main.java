package behavioraldesignpatterns.strategy.withstrategypattern;

//client. just needs to choose and pass the relevant strategy to the service. the service will handle everything else.
public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        int x = 2;  //substitute for user controlled input. EG: This value can be changed depending on which button the user presses, thereby allowing us two switch the strategy at runtime.
        if (x % 2 ==0) {
            paymentService.setPaymentStrategy(new PaymentByCreditCard());
        } else {
            paymentService.setPaymentStrategy(new PaymentByPaypal());
        }
        paymentService.processOrder();
    }
}
