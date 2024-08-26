package behavioraldesignpatterns.observer.subscribe;


import behavioraldesignpatterns.observer.publish.Publisher;

public class MobileSubscriber implements Subscriber {

    String phoneNumber;

    Publisher publisher;

    public MobileSubscriber(String phoneNumber, Publisher publisher) {
        this.phoneNumber = phoneNumber;
        this.publisher = publisher;
    }

    @Override
    public void update() {
        pushNotificationToMobile(phoneNumber, "Hurry, the product is back in stock! Stock count is: " + publisher.getAvailableQuantity());
    }

    private void pushNotificationToMobile(String phoneNumber, String message) {
        System.out.println("Notification content is: " + message);
        System.out.println("Notification sent to: " + phoneNumber);
    }
}
