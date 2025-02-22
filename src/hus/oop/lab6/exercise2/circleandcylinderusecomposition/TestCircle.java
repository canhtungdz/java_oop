package hus.oop.lab6.exercise2.circleandcylinderusecomposition;



public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2.0, "blue");
        System.out.println(circle1.getRadius());
        circle1.setRadius(5.0);
        System.out.println(circle1.getRadius());
        System.out.println("Area=" + circle1.getArea());
        System.out.println(circle1.toString());
    }
    
}
