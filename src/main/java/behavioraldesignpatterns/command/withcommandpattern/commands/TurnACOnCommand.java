package behavioraldesignpatterns.command.withcommandpattern.commands;

import behavioraldesignpatterns.command.withoutcommandpattern.AirConditioner;

public class TurnACOnCommand implements Command {
    AirConditioner airConditioner;

    public TurnACOnCommand(AirConditioner ac) {
        airConditioner = ac;
    }

    @Override
    public void execute() {
        airConditioner.turnOnAc();
    }

    @Override
    public void undo() {
        airConditioner.turnOffAc();
    }
}
