package Source.code;

public class Circle extends Shape {
    private double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle at (" + x + ", " + y + ") with radius " + radius + " and area " + calculateArea();
    }
}
