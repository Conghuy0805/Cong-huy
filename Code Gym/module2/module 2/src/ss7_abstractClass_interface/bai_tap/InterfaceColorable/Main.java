package ss7_abstractClass_interface.bai_tap.InterfaceColorable;

public class Main {
    public static void main(String[] args) {
        Shape2[] color = new Shape2[2];
        color[0] = new Circle(4);
        color[1] = new Square(2);
        for (int i = 0; i < color.length; i++) {
            if (color[i] instanceof Square) {
                System.out.println("Diện tích hình vuông: " + ((Square) color[i]).getArea());
            } else {
                System.out.println("Diện tích hình tròn: " + ((Circle) color[i]).getArea());
            }
            if (color[i] instanceof Colorable) {
                ((Colorable) color[i]).howToColor();
            }
        }
    }
}
