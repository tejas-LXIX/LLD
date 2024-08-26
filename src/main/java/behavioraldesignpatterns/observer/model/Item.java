package behavioraldesignpatterns.observer.model;

import behavioraldesignpatterns.observer.publish.Publisher;
import behavioraldesignpatterns.observer.subscribe.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class Item implements Publisher {

    List<Subscriber> subscribers = new ArrayList<>();

    private String name;

    private int availableQuantity;

    public Item(String name, int availableQuantity) {
        this.name = name;
        this.availableQuantity = availableQuantity;
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber sub:subscribers) {
            sub.update();
        }
    }

    @Override
    public int getAvailableQuantity() {
        return availableQuantity;
    }

    @Override
    public void setAvailableQuantity(int availableQuantity) {
        boolean backInStock = this.availableQuantity == 0 && availableQuantity!=0;
        this.availableQuantity = availableQuantity;
        if (backInStock) {
            notifySubscribers();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
