package ss7_abstractClass_interface.bai_tap.InterfaceResizeable;

public class Circle extends Area implements Resizeable {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void resize(double percent) {
        System.out.print("Diện tích hình tròn sau khi tăng lên " + percent + " : ");
        radius = this.getRadius() + (this.getRadius() * (percent / 100));
        System.out.println(Math.PI * radius * radius);
    }
}
