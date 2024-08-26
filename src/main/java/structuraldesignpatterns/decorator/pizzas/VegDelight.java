package structuraldesignpatterns.decorator.pizzas;

public class VegDelight implements BasePizza{
    @Override
    public int cost() {
        return 120;
    }
}
