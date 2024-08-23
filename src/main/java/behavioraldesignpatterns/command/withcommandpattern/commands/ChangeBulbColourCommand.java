package behavioraldesignpatterns.command.withcommandpattern.commands;

import behavioraldesignpatterns.command.withoutcommandpattern.Bulb;

public class ChangeBulbColourCommand implements Command {
    Bulb bulb;

    public ChangeBulbColourCommand(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        bulb.changeColour();
    }

    @Override
    public void undo() {
        bulb.changeColour();
    }
}
