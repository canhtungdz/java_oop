package hus.oop.lab7.exercise1.ex1;

public class Circle extends Shape{
    protected double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public Circle(double radius, String color, Boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() +
                ",radius=" + radius +
                "]";
    }
}
