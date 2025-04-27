package behavioraldesignpatterns.memento;

import java.util.Stack;

public class ConfigurationCaretaker {

    Stack<ConfigurationMemento> history = new Stack<>();

    public void addMemento(ConfigurationMemento memento) {
        history.add(memento);
    }

    public ConfigurationMemento undo() {
        return history.isEmpty() ? null : history.pop();
    }
}
