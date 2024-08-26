package structuraldesignpatterns.decorator.toppings;

import structuraldesignpatterns.decorator.pizzas.BasePizza;

public class Mushroom implements BasePizza {

    BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 15;
    }
}
