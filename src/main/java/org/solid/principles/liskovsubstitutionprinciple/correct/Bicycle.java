package org.solid.principles.liskovsubstitutionprinciple.correct;

public class Bicycle implements EngineLessBike {

    boolean areFeetOnPedals;
    int speed;

    @Override
    public void accelerate() {
        speed = speed + 10;
    }

    @Override
    public void putFeetOnPedals() {
        areFeetOnPedals = true;
    }
}
