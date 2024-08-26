package structuraldesignpatterns.decorator.toppings;

import structuraldesignpatterns.decorator.pizzas.BasePizza;

//implements BasePizza, so that the client always interacts with an object of BazePizza, no matter how many decorators are added around the pizza.
public class ExtraCheese implements BasePizza {

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 10;
    }
}
