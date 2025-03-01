package hus.oop.lab6.exercise1.shape;

public class Rectangle extends Shape{
    protected double width = 1.0;
    protected double length = 1.0;
    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
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
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return (length + width) * 2;
    }
    public String toString() {
        return "Rectangle[" + super.toString() +
                ",width=" + width +
                ",length=" + length +
                "]";
    }
}
