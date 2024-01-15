package ss2_loop_in_java.thuc_hanh;

public class q {
    static public int X = 2;

    public static void main(String[] args) {
        q o1 = new q();
        q o2 = new q();
        o2.X = 5;
        System.out.printf("x=%d, y=%d, z=%d", o1.X, o2.X, q.X);
    }
}
