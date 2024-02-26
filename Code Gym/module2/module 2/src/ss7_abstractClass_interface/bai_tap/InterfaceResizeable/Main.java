package ss7_abstractClass_interface.bai_tap.InterfaceResizeable;


public class Main {
    public static void main(String[] args) {
        Resizeable[] resizeables = new Resizeable[3];
        resizeables[0] = new Circle(2);
        resizeables[1] = new Rectangle(3.0, 4.0);
        resizeables[2] = new Square(4.0);
        for (Resizeable test : resizeables) {
            if (test instanceof Circle) {
                System.out.println("Diện tích hình tròn ban đầu: " + ((Circle) test).getArea());
            } else if (test instanceof Rectangle) {
                System.out.println("\n" + "Diện tích hình chữ nhật ban đầu: " + ((Rectangle) test).getArea());
            } else {
                System.out.println("\n" + "Diện tích hình vuông ban đầu:  " + ((Square) test).getArea());
            }

            double randomDouble = Math.random();
            randomDouble = randomDouble * 100 + 1;
            int randomInt = (int) randomDouble;
            test.resize(randomInt);

        }
    }
}
