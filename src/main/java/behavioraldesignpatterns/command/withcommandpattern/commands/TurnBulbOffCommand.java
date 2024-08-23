package behavioraldesignpatterns.command.withcommandpattern.commands;

import behavioraldesignpatterns.command.withoutcommandpattern.Bulb;

public class TurnBulbOffCommand implements Command {
    Bulb bulb;

    public TurnBulbOffCommand(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        bulb.turnOffBulb();
    }

    @Override
    public void undo() {
        bulb.turnOnBulb();
    }
}
