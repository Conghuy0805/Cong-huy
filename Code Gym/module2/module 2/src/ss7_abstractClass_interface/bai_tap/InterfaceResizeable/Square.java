package ss7_abstractClass_interface.bai_tap.InterfaceResizeable;

import ss7_abstractClass_interface.bai_tap.InterfaceResizeable.Area;
import ss7_abstractClass_interface.bai_tap.InterfaceResizeable.Resizeable;

public class Square extends Area implements Resizeable {
    private double side = 1.0;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void resize(double percent) {
        System.out.print("Diện tích hình vuông sau khi tăng lên " + percent + " :");
        side = this.getSide() + (this.getSide() * (percent / 100));
        System.out.println(side * side);
    }
}
