package hus.oop.lab6.exercise1.shape;

public class TestSquare {
    public static void main(String[] args) {
        Shape shape2 = new Square(5);
        System.out.println("Side=" + ((Square)shape2).getSide());
        ((Square)shape2).setSide(9.0);
        System.out.println("newSide=" + ((Square)shape2).getSide());
        ((Square)shape2).setLength(11.0);
        System.out.println("newSide=" + ((Square)shape2).getSide());
        System.out.println(shape2.toString());
    }
}
