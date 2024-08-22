package org.solid.principles.interfacesegregation.incorrect;

public class CrazyPerson implements BearKeeper {
    @Override
    public void washTheBear() {
        //not my job. but i still have to implement it.
    }

    @Override
    public void feedTheBear() {
        //not my job. but i still have to implement it.
    }

    @Override
    public void petTheBear() {
//        petBearAndDie();
    }
}
