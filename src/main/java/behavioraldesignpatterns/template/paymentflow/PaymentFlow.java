package behavioraldesignpatterns.template.paymentflow;

public abstract class PaymentFlow {

    protected abstract int calculateFees(int amount);

    protected abstract void debitAmount(int amount);

    protected abstract void creditAmount(int amount);

    public final void sendMoney(int amount) {
        amount = amount - calculateFees(amount);
        debitAmount(amount);
        creditAmount(amount);
    }
}
