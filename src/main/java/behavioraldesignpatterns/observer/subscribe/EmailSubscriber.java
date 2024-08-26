package behavioraldesignpatterns.observer.subscribe;


import behavioraldesignpatterns.observer.publish.Publisher;

public class EmailSubscriber implements Subscriber {

    String emailId;

    Publisher publisher;

    public EmailSubscriber(String emailId, Publisher publisher) {
        this.emailId = emailId;
        this.publisher = publisher;
    }

    @Override
    public void update() {
        sendEmail(emailId, "Hurry, the product is back in stock! Stock count is: " + publisher.getAvailableQuantity());
    }

    private void sendEmail(String emailId, String message) {
        System.out.println("Email content is: " + message);
        System.out.println("Email sent to: " + emailId);
    }
}
