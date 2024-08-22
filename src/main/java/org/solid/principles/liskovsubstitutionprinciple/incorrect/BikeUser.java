package org.solid.principles.liskovsubstitutionprinciple.incorrect;

//This principle states that: if class Bicycle is a subtype of class Bike, we should be able to use Bicycle in place of Bike without breaking any existing code.

//this class used to work properly when given a Bike object (motorcycle).
//Now, when I have added a new type of Bike called Bicycle, this code will stop working. Because, Bicycle doesn't have an engine.
public class BikeUser {
    Bike bike;

    public void useBike() {
        bike.turnOnEngine();    //this will throw an exception if Bike is a Bicycle.
        bike.accelerate();
    }
}
