package Test.code;


import Source.code.Circle;
import Source.code.Rectangle;
import Source.code.Square;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShapeOrderPrinterTests {

    @Test
    public void testCircleArea() {
        Circle circle = new Circle(0, 0, 5);
        assertEquals(78.53981633974483, circle.calculateArea(), 0.001);
    }
    @Test
    public void testRectangleArea() {
        Rectangle rectangle = new Rectangle(0, 0, 4, 5);
        assertEquals(20, rectangle.calculateArea(),20);
    }
    @Test
    public void testSquareArea() {
        Square square = new Square(0, 0, 4);
        assertEquals(16, square.calculateArea(),14);
    }
}

