package org.solid.principles.liskovsubstitutionprinciple.correct;

//this class used to work properly when given a EngineBike object (motorcycle).
//Now, when I have created a new type of Bike called EngineLessBike, since it's not a subtype of EngineBike, we are not violating LSP here.
//We will have to write new code for EngineLessBike user. This way, regression isn't introduced and existing code won't break.
//So, existing code will still work as is. If EngineBike is substitued by any child type, it will still work properly.
public class BikeUser {
    EngineBike bike;

    public void useBike() {
        bike.turnOnEngine();
        bike.accelerate();
    }
}
