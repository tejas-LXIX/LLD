package behavioraldesignpatterns.command.withcommandpattern.commands;

import behavioraldesignpatterns.command.withoutcommandpattern.Bulb;

public class TurnBulbOnCommand implements Command {
    Bulb bulb;

    public TurnBulbOnCommand(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        bulb.turnOnBulb();
    }

    @Override
    public void undo() {
        bulb.turnOffBulb();
    }
}
