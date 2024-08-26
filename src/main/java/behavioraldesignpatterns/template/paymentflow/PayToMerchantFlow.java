package behavioraldesignpatterns.template.paymentflow;

public class PayToMerchantFlow extends PaymentFlow {

    @Override
    protected int calculateFees(int amount) {
        return (int) (0.02 * amount);
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