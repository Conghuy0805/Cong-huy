package ss6_inheritance.bai_tap.ClassTriangle;

public class Test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("red", 3.0, 4.0, 5.0);
        System.out.println(triangle);
        System.out.println("Chu vi tam giác: " + triangle.getPerimeter());
        System.out.println("Diện tích tam giác: " + triangle.getArea());
        System.out.println("\n");

        Triangle triangle2 = new Triangle("blue", 3.0, 4.0, 5.0);
        triangle2.setSize1(5.0);
        triangle2.setSize2(7.0);
        triangle2.setSize3(9.0);
        System.out.println(triangle2);
        System.out.println("Chu vi tam giác: " + triangle2.getPerimeter());
        System.out.println("Diện tích tam giác: " + triangle2.getArea());
    }
}
