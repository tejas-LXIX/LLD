package org.solid.principles.dependencyinversionprinciple.incorrect;

//Macbook is tightly coupled to a specific Keyboard and specific mouse. it won't work with bluetooth keyboard or mouse.
public class MacBook {

    private final WiredKeyboard keyboard;
    private final WiredMouse mouse;

    public MacBook() {
        keyboard = new WiredKeyboard();
        mouse = new WiredMouse();
    }

}
