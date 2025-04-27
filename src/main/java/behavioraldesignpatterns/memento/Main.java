package behavioraldesignpatterns.memento;

public class Main {

    public static void main(String[] args) {
        ConfigurationCaretaker caretaker = new ConfigurationCaretaker();
        ConfigurationOriginator configurationOriginator = new ConfigurationOriginator(5,10);

        ConfigurationMemento snapshot1 = configurationOriginator.createMemento();

        caretaker.addMemento(snapshot1);

        configurationOriginator.setHeight(7);
        configurationOriginator.setWidth(12);

        caretaker.addMemento(configurationOriginator.createMemento());

        configurationOriginator.setHeight(45);
        configurationOriginator.setWidth(61);

        ConfigurationMemento configurationMemento = caretaker.undo();
        configurationOriginator.restoreMemento(configurationMemento);

        System.out.println("height: " + configurationOriginator.height + " width: " + configurationOriginator.width);
    }

}
