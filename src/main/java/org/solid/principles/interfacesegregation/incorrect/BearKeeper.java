package org.solid.principles.interfacesegregation.incorrect;

//As avid zookeepers, we’re more than happy to wash and feed our beloved bears. But we’re all too aware of the dangers of petting them.
//Unfortunately, our interface is rather large, and we have no choice but to implement the code to pet the bear.
//Let’s fix this by splitting our large interface into three separate ones:
public interface BearKeeper {
    void washTheBear();
    void feedTheBear();
    void petTheBear();
}
