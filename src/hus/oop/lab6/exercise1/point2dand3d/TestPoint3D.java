package hus.oop.lab6.exercise1.point2dand3d;

public class TestPoint3D {
    public static void main(String[] args) {
        Point2D point1 = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println(((Point3D)point1).getZ());
        ((Point3D)point1).setZ(5.0f);
        System.out.println(((Point3D)point1).getZ());
        ((Point3D)point1).setXYZ(7.0f, 8.0f, 9.0f);
        for (float a : ((Point3D)point1).getXYZ()) {
            System.out.println(a);
        }
        System.out.println(point1.toString());
    }
}
