package creationaldesignpatterns.factory;

import creationaldesignpatterns.factory.factories.ShapeFactory;
import creationaldesignpatterns.factory.model.Shape;

public class MainClass {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("CIRCLE");
        shape.draw();
    }
}
