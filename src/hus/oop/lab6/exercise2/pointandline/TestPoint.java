package hus.oop.lab6.exercise2.pointandline;

public class TestPoint {
    public static void main(String[] args) {
        Point point1 = new Point(10, 20);
        System.out.println(point1);
        point1.setXY(100, 10);
        System.out.println(point1);
    }
}
