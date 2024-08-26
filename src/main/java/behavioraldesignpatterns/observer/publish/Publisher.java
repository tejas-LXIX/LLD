package behavioraldesignpatterns.observer.publish;

import behavioraldesignpatterns.observer.subscribe.Subscriber;

public interface Publisher {

    public void addSubscriber(Subscriber subscriber);

    public void removeSubscriber(Subscriber subscriber);

    public void notifySubscribers();

    public void setAvailableQuantity(int count);

    public int getAvailableQuantity();
}
