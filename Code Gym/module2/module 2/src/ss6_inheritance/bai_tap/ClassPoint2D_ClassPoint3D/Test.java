package ss6_inheritance.bai_tap.ClassPoint2D_ClassPoint3D;

public class Test {
    public static void main(String[] args) {
        Point2D point2D_1 = new Point2D();
        System.out.println(point2D_1);
        Point2D point2D_2 = new Point2D(2.0f, 3.0f);
        System.out.println(point2D_2.toString());
        Point3D point3D_1 = new Point3D();
        System.out.println(point3D_1);
        Point3D point3D_2 = new Point3D(2.0f, 3.0f, 4.0f);
        System.out.println(point3D_2.toString());
    }
}
