package org.solid.principles.liskovsubstitutionprinciple.incorrect;

//violates liskov principle. because, this class doesn't extend but restricts the functionality given by Bike, because it doesn't have an engine.
public class Bicycle implements Bike {

    int speed;

    @Override
    public void turnOnEngine() {
        throw new RuntimeException("There is no engine");
    }

    @Override
    public void accelerate() {
        speed = speed + 10;
    }
}
