package behavioraldesignpatterns.template.paymentflow;

public class PayToFriendFlow extends PaymentFlow {

    @Override
    protected int calculateFees(int amount) {
        return 0;
    }

    @Override
    protected void debitAmount(int amount) {
        System.out.println("debit amount " + amount);
    }

    @Override
    protected void creditAmount(int amount) {
        System.out.println("credit amount " + amount);
    }
}
