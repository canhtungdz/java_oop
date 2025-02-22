package hus.oop.lab6.exercise1.thecircleandcylinderclasses;

public class Cylinder extends Circle{
    private double height = 1.0;
    public Cylinder(){
        super();
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return super.getArea() * height;
    }
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() +
                " height=" + height;
    }
}
