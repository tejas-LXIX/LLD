package behavioraldesignpatterns.command.withoutcommandpattern;

//Receiver
public class AirConditioner {
    boolean isOn;
    int temperature;

    public void turnOnAc() {
        isOn = true;
        System.out.println("AC is ON");
    }

    public void turnOffAc() {
        isOn = false;
        System.out.println("AC is OFF");
    }

    public void setTemperature(int temp) {
        this.temperature = temp;
        System.out.println("Temperature changed to: " + temperature);
    }
}
