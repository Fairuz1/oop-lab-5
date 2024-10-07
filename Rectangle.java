package Source.code;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle at (" + x + ", " + y + ") with width " + width + ", height " + height + " and area " + calculateArea();
    }
}
