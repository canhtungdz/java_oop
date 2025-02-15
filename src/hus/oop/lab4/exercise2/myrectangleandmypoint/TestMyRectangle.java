package hus.oop.lab4.exercise2.myrectangleandmypoint;

public class TestMyRectangle {
    public static void main(String[] args) {
        // Creating a rectangle using coordinates
        MyRectangle r1 = new MyRectangle(1, 5, 6, 1);
        System.out.println(r1);
        System.out.println("Width: " + r1.getWidth());
        System.out.println("Height: " + r1.getHeight());
        System.out.println("Perimeter: " + r1.getPerimeter());
        System.out.println("Area: " + r1.getArea());

        // Creating a rectangle using MyPoint instances
        MyPoint p1 = new MyPoint(2, 7);
        MyPoint p2 = new MyPoint(8, 2);
        MyRectangle r2 = new MyRectangle(p1, p2);
        System.out.println(r2);
        System.out.println("Width: " + r2.getWidth());
        System.out.println("Height: " + r2.getHeight());
        System.out.println("Perimeter: " + r2.getPerimeter());
        System.out.println("Area: " + r2.getArea());
    }
}

