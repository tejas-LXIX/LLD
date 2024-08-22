package creationaldesignpatterns.factory.factories;

import creationaldesignpatterns.factory.model.Circle;
import creationaldesignpatterns.factory.model.Rectangle;
import creationaldesignpatterns.factory.model.Shape;

public class ShapeFactory {
    public Shape getShape(String input) {
        switch (input) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            default:
                return null;
        }
    }
}
