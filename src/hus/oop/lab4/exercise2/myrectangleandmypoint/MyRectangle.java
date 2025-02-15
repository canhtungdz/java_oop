package hus.oop.lab4.exercise2.myrectangleandmypoint;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // Constructor using coordinates
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    // Constructor using MyPoint instances
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Get width of the rectangle
    public double getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    // Get height of the rectangle
    public double getHeight() {
        return Math.abs(topLeft.getY() - bottomRight.getY());
    }

    // Calculate perimeter
    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    // Calculate area
    public double getArea() {
        return getWidth() * getHeight();
    }

    // toString() method
    @Override
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}

