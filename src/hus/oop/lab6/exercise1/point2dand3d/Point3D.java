package hus.oop.lab6.exercise1.point2dand3d;

public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D() {
        super();
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }
    public float[] getXYZ() {
        return new float[]{x, y, z};
    }
    public String toString() {
        return "(" + x +
                "," + y +
                "," + z +
                ")";
    }
}
