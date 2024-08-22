package org.solid.principles.interfacesegregation.incorrect;

public class BearCarer implements BearKeeper {
    @Override
    public void washTheBear() {
        //wash the bear
    }

    @Override
    public void feedTheBear() {
        //feed the bear
    }

    @Override
    public void petTheBear() {
        //are you stupid? i will not do that. but i have to implement this method anyway.
    }
}
