package hus.oop.lab6.exercise1.shape;

public class TestCircle {
    public static void main(String[] args) {
        Shape shape1 = new Circle(2.0, "blue", false);
        System.out.println(((Circle)shape1).getRadius());
        ((Circle)shape1).setRadius(5.0);
        System.out.println(((Circle)shape1).getRadius());
        System.out.println("Area=" + ((Circle)shape1).getArea());
        System.out.println("Perimeter=" + ((Circle)shape1).getPerimeter());
        System.out.println(shape1.toString());
    }
}
