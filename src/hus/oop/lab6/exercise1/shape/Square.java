package hus.oop.lab6.exercise1.shape;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }
    public double getSide() {
        return length;
    }
    public void setSide(double side) {
        length = side;
        width = side;
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
    public String toString() {
        return "Square[" + super.toString() +
                "]";
    }
}
