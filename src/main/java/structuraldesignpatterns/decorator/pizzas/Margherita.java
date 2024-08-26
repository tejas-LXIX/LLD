package structuraldesignpatterns.decorator.pizzas;

public class Margherita implements BasePizza{
    @Override
    public int cost() {
        return 100;
    }
}
