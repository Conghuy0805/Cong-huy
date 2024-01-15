package ss6_inheritance.bai_tap.ClassCircle_ClassCylinder;

public class Circle {
    private double radius;
    private String color;
    private static final double PI = 3.14;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return 2 * getRadius() * PI;
    }

    public double getPerimeter() {
        return (Math.pow(getArea(), 2)) * PI;
    }

    @Override
    public String toString() {
        return "Circle: " + "\n"
                + "Bán kính = " + radius + "\t"
                + "Chu vi = " + getPerimeter() + "\t"
                + "Diện tích = " + getArea();
    }
}
