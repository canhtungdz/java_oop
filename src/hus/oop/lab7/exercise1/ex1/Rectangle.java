package hus.oop.lab7.exercise1.ex1;

public class Rectangle extends Shape{
    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, Boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double getArea() {
        return length * width;
    }

    @Override
    double getPerimeter() {
        return (length * width) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString() +
                ",width=" + width +
                ",length=" + length +
                "]";
    }
}
