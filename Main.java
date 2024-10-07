package Source.code;
import Source.code.ShapeOrderPrinter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(1, 2, 3));
        shapes.add(new Circle(0, 0, 2));
        shapes.add(new Rectangle(4, 5, 2, 3));
        shapes.add(new Square(2, 1, 1));
        shapes.add(new Circle(1, 1, 1));

        ShapeOrderPrinter orderPrinter = new ShapeOrderPrinter();
        orderPrinter.printOrderedShapes(shapes);
    }
}
