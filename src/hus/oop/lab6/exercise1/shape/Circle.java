package hus.oop.lab6.exercise1.shape;

public class Circle extends Shape{
    protected double radius = 1.0;
    public Circle(){
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius *radius;
    }
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }
    public String toString() {
        return "Circle[" + super.toString() +
                ",radius=" + radius +
                "]";
    }
}
