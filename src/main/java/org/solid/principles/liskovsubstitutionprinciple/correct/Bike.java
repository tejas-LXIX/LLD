package org.solid.principles.liskovsubstitutionprinciple.correct;

//has only very generic functionality. Common for all. Because it's a safe assumption that all Bikes can accelerate. But it's an unsafe assumption that all bikes have an engine.
public interface Bike {
    void accelerate();
}
