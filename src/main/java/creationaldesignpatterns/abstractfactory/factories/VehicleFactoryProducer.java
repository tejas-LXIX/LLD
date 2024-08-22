package creationaldesignpatterns.abstractfactory.factories;

public class VehicleFactoryProducer {
    public static VehicleFactory getFactory(String input) {
        if(input.equals("Economy")) {
            return new EconomyCarFactory();
        } else if(input.equals("Luxury") || input.equals("Premium")) {
            return new LuxuryCarFactory();
        }
        return null;
    }
}
