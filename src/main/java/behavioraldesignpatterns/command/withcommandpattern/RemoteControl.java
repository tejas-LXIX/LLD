package behavioraldesignpatterns.command.withcommandpattern;

import behavioraldesignpatterns.command.withcommandpattern.commands.Command;

import java.util.Stack;

//Invoker
public class RemoteControl {

    Stack<Command> commandHistory = new Stack<>();
    Command command;

    RemoteControl() {

    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
        commandHistory.add(command);
    }

    public void undo() {
        if (!commandHistory.isEmpty()) {
            Command undoCommand = commandHistory.pop();
            undoCommand.undo();
        }
    }
}
