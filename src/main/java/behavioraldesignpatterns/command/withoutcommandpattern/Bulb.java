package behavioraldesignpatterns.command.withoutcommandpattern;

//Receiver
public class Bulb {
    boolean isOn;

    private String colour = "Blue";

    public void turnOnBulb() {
        isOn = true;
        System.out.println("Bulb is ON");
    }

    public void turnOffBulb() {
        isOn = false;
        System.out.println("Bulb is OFF");
    }

    public void changeColour() {
        if("Blue".equals(colour)) {
            colour = "Red";
        } else if ("Red".equals(colour)){
            colour = "Blue";
        }
        System.out.println("The bulb colour is now " + colour);
    }
}
