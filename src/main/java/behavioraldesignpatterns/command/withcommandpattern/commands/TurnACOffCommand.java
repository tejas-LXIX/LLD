package behavioraldesignpatterns.command.withcommandpattern.commands;

import behavioraldesignpatterns.command.withoutcommandpattern.AirConditioner;

public class TurnACOffCommand implements Command {
    AirConditioner airConditioner;

    public TurnACOffCommand(AirConditioner ac) {
        airConditioner = ac;
    }

    @Override
    public void execute() {
        airConditioner.turnOffAc();
    }

    @Override
    public void undo() {
        airConditioner.turnOnAc();
    }
}
