package behavioraldesignpatterns.command.withcommandpattern;

import behavioraldesignpatterns.command.withcommandpattern.commands.*;
import behavioraldesignpatterns.command.withoutcommandpattern.AirConditioner;
import behavioraldesignpatterns.command.withoutcommandpattern.Bulb;

public class Main {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(new TurnACOnCommand(ac));
        remoteControl.execute();

        remoteControl.setCommand(new TurnACOffCommand(ac));
        remoteControl.execute();

        Bulb bulb = new Bulb();

        remoteControl.setCommand(new TurnBulbOnCommand(bulb));
        remoteControl.execute();

        remoteControl.setCommand(new TurnBulbOffCommand(bulb));
        remoteControl.execute();

        remoteControl.setCommand(new ChangeBulbColourCommand(bulb));
        remoteControl.execute();

        System.out.println("Undo commands will be executed now.");

        remoteControl.undo();
        remoteControl.undo();
        remoteControl.undo();
        remoteControl.undo();
        remoteControl.undo();
    }
}
