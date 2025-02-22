package hus.oop.lab6.exercise2.circleandcylinderusecomposition;

public class Cylinder {
    private Circle base;
    private double height;
    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return base.getArea() * height;
    }
    @Override
    public String toString() {
        return "Cylinder[" + base.toString() +
                "height=" + height +
                "]";
    }

}
