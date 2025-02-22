package hus.oop.lab7.exercise1.ex5;

public class TestResizableCircle {
    public static void main(String[] args) {
        ResizableCircle resizableCircle = new ResizableCircle(5.0);
        System.out.println(resizableCircle);
        System.out.println("Area: " + resizableCircle.getArea());
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());

        resizableCircle.resize(50);
        System.out.println("After resizing by 50%");
        System.out.println(resizableCircle);
        System.out.println("Area: " + resizableCircle.getArea());
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());
    }
}
