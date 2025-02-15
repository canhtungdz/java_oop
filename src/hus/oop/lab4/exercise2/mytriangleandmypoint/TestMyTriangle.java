package hus.oop.lab4.exercise2.mytriangleandmypoint;

public class TestMyTriangle {
    public static void main(String[] args) {
        // Tạo tam giác bằng tọa độ
        MyTriangle t1 = new MyTriangle(0, 0, 3, 0, 0, 4);
        System.out.println(t1);
        System.out.println("Perimeter: " + t1.getPerimeter());
        System.out.println("Type: " + t1.getType());

        // Tạo tam giác bằng đối tượng MyPoint
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(4, 1);
        MyPoint p3 = new MyPoint(2, 4);
        MyTriangle t2 = new MyTriangle(p1, p2, p3);
        System.out.println(t2);
        System.out.println("Perimeter: " + t2.getPerimeter());
        System.out.println("Type: " + t2.getType());
    }
}

