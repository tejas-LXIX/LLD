package structuraldesignpatterns.decorator.pizzas;

public class Farmhouse implements BasePizza{
    @Override
    public int cost() {
        return 200;
    }
}
