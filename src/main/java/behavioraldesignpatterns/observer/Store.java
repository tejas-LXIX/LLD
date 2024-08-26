package behavioraldesignpatterns.observer;

import behavioraldesignpatterns.observer.model.Item;
import behavioraldesignpatterns.observer.publish.Publisher;
import behavioraldesignpatterns.observer.subscribe.MobileSubscriber;
import behavioraldesignpatterns.observer.subscribe.EmailSubscriber;
import behavioraldesignpatterns.observer.subscribe.Subscriber;

public class Store {
    public static void main(String[] args) {
        Publisher publisher = new Item("Lenovo Loq 2024", 0);

        Subscriber subscriber = new MobileSubscriber("1234567890", publisher);
        Subscriber subscriber2 = new EmailSubscriber("random@testemail.com", publisher);
        Subscriber subscriber3 = new MobileSubscriber("111111111111", publisher);

        publisher.addSubscriber(subscriber);
        publisher.addSubscriber(subscriber2);
        publisher.addSubscriber(subscriber3);

        publisher.setAvailableQuantity(13);
    }
}
