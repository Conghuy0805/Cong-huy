package ss6_inheritance.thuc_hanh.ClassShape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red" , false);
        System.out.println(shape);
//        Shape shape1 = new Shape("red", false);
//        System.out.println(shape1);
    }
}
