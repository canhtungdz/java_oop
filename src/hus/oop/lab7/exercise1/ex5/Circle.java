package hus.oop.lab7.exercise1.ex5;

public class Circle implements GeometricObject {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public String toString() {
        return "Circle[radius=" + radius +
                "]";
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }
}
