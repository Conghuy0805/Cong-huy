package ss6_inheritance.bai_tap.ClassCircle_ClassCylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder: " + "\n"
                + "Thể tích = " + getVolume();
    }
}
