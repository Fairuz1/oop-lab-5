package Source.code;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ShapeOrderPrinter {
    public void orderShapes(List<Shape> shapes) {
        Collections.sort(shapes, new Comparator<Shape>() {
            @Override
            public int compare(Shape shape1, Shape shape2) {
                int areaCompare = Double.compare(shape1.calculateArea(), shape2.calculateArea());
                if (areaCompare != 0) {
                    return areaCompare;
                }
                int xCompare = Double.compare(shape1.getX(), shape2.getX());
                if (xCompare != 0) {
                    return xCompare;
                }
                return Double.compare(shape1.getY(), shape2.getY());
            }
        });
    }

    public void printOrderedShapes(List<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}


