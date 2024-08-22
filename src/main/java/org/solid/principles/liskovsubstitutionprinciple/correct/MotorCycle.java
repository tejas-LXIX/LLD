package org.solid.principles.liskovsubstitutionprinciple.correct;

public class MotorCycle implements EngineBike {

    boolean isEngineOn;
    int speed;

    @Override
    public void turnOnEngine() {
        isEngineOn = true;
    }

    @Override
    public void accelerate() {
        speed = speed + 10;
    }
}
