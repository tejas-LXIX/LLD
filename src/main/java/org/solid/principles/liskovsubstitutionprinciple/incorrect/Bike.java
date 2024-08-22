package org.solid.principles.liskovsubstitutionprinciple.incorrect;

//incorrect interface. because this interface assumes all implementers will have an engine.
public interface Bike {
    void turnOnEngine();
    void accelerate();
}
