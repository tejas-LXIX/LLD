package behavioraldesignpatterns.command.withoutcommandpattern;

//problem with the below code. Client needs to be aware of all the steps to execute a given functionality.
//Client has business logic in it, which is incorrect. Sender (Client) and Receiver (AirConditioner) are tightly coupled.
//if any other step gets added in between, client will need to make changes to call that method.
//Client also needs to know about all the devices, and the steps (business logic) for each.
public class Main {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        ac.turnOnAc();
        ac.setTemperature(24);
        ac.turnOffAc();

        Bulb bulb = new Bulb();
        bulb.turnOnBulb();
        bulb.turnOffBulb();
    }
}
