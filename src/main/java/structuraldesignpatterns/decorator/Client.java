package structuraldesignpatterns.decorator;

import structuraldesignpatterns.decorator.pizzas.BasePizza;
import structuraldesignpatterns.decorator.pizzas.Margherita;
import structuraldesignpatterns.decorator.toppings.ExtraCheese;
import structuraldesignpatterns.decorator.toppings.Mushroom;

public class Client {
    public static void main(String[] args) {
        //Client decides what decorators to wrap around the base object.
        BasePizza pizza = new Mushroom(new ExtraCheese(new Margherita()));
        System.out.println(pizza.cost());
    }
}
