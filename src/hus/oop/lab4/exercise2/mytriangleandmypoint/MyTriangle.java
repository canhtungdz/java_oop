package hus.oop.lab4.exercise2.mytriangleandmypoint;

public class MyTriangle {
    private MyPoint v1, v2, v3;

    // Constructor nhận tọa độ
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    // Constructor nhận các đối tượng MyPoint
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    // Phương thức toString()
    @Override
    public String toString() {
        return "MyTriangle[v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + "]";
    }

    // Phương thức tính chu vi
    public double getPerimeter() {
        double side1 = v1.distance(v2);
        double side2 = v2.distance(v3);
        double side3 = v3.distance(v1);
        return side1 + side2 + side3;
    }

    // Phương thức xác định loại tam giác
    public String getType() {
        double side1 = v1.distance(v2);
        double side2 = v2.distance(v3);
        double side3 = v3.distance(v1);

        if (side1 == side2 && side2 == side3) {
            return "Equilateral"; // Tam giác đều
        } else if (side1 == side2 || side2 == side3 || side3 == side1) {
            return "Isosceles"; // Tam giác cân
        } else {
            return "Scalene"; // Tam giác thường
        }
    }
}
