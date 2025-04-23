package behavioraldesignpatterns.visitor;

public interface RoomElement {

    //this method is required in all elements to accept the visitor and tell it what to do.
    public void accept(RoomVisitor visitor);

}
