package behavioraldesignpatterns.template;


import behavioraldesignpatterns.template.paymentflow.PayToFriendFlow;
import behavioraldesignpatterns.template.paymentflow.PayToMerchantFlow;
import behavioraldesignpatterns.template.paymentflow.PaymentFlow;

public class Main {
    public static void main(String[] args) {
        PaymentFlow paymentFlow;
        String receiver = "Friend";
        if (receiver.equals("Friend")) {
            paymentFlow = new PayToFriendFlow();
        } else {
            paymentFlow = new PayToMerchantFlow();
        }
        paymentFlow.sendMoney(20000);

        receiver = "Merchant";
        if (receiver.equals("Friend")) {
            paymentFlow = new PayToFriendFlow();
        } else {
            paymentFlow = new PayToMerchantFlow();
        }
        paymentFlow.sendMoney(20000);
    }
}