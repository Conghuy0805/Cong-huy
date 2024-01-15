package ss7_abstractClass_interface.bai_tap.InterfaceResizeable;

public class Rectangle extends Area implements Resizeable {
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.height = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setLength(double length) {
        this.height = length;
    }

    public double getArea() {
        return width * height;
    }

    @Override
    public void resize(double percent) {
        System.out.print("Diện tích hình chữ nhật sau khi tăng lên " + percent + " : ");
        width = this.getWidth() + (this.getWidth() * (percent / 100));
        height = this.getHeight() + (this.getHeight() * (percent / 100));
        System.out.println(width * height);

    }
}
