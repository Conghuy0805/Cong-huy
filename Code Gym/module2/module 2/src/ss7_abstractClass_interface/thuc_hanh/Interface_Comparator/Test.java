package ss7_abstractClass_interface.thuc_hanh.Interface_Comparator;

import ss6_inheritance.thuc_hanh.ClassCircle.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "green", false);

        System.out.println("Trước khi sắp xếp: ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator cirleComparator = new CircleComparator();
        Arrays.sort(circles, cirleComparator);

        System.out.println("Sau khi sắp xếp: ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
