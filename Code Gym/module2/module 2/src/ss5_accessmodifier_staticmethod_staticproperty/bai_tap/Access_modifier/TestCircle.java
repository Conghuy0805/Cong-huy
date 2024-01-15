package ss5_accessmodifier_staticmethod_staticproperty.bai_tap.Access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Bán kính đối tượng 1: " + circle1.getRadius());
        System.out.println("Diện tích đối tượng 1: " + circle1.getArea());
        Circle circle2 = new Circle(2.0, "blue");
        System.out.println("Bán kính đối tượng 2: " + circle2.getRadius());
        System.out.println("Diện tích đối tượng 2: " + circle2.getArea());
    }
}
