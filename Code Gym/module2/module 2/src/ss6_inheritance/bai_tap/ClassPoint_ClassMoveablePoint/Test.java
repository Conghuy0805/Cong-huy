package ss6_inheritance.bai_tap.ClassPoint_ClassMoveablePoint;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(1.0f, 2.0f);
        System.out.println(Arrays.toString(point.getXY()));
        MoveablePoint move = new MoveablePoint(1.0f, 2.0f, 100.0f, 200.0f);
        System.out.println(move);
        move.setSpeed(20.0f, 40.0f);
        System.out.println(move);
        System.out.println(move.move());
    }
}
