package Source.code;

public class Square extends Shape {
    private double sideLength;

    public Square(double x, double y, double sideLength) {
        super(x, y);
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }

    @Override
    public String toString() {
        return "Square at (" + x + ", " + y + ") with side length " + sideLength + " and area " + calculateArea();
    }
}
