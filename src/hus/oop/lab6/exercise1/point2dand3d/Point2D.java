package hus.oop.lab6.exercise1.point2dand3d;

public class Point2D {
    protected float x = 0.0f;
    protected float y = 0.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        return new float[]{x, y};
    }
    public String toString() {
        return "(" + x +
                "," + y +
                ")";
    }
}
