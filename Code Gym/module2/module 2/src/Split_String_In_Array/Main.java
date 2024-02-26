package Split_String_In_Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "Xin chào các bạn, tui là Huy";

        // Cách 1 khoảng trắng thì sẽ cắt 1 phần tử
        String[] a = s.split(" ");
        System.out.println(Arrays.toString(a));

        String[] b = s.split(",");
        System.out.println(Arrays.toString(b));

        String s2 = "Xin chào, mình là Huy. Mình là lập trình viên!";
        String[] c = s2.split("\\.|\\,");
        System.out.println(Arrays.toString(c));
        System.out.println();

        String s3 = "Nguyễn Văn A";
        String[] d = s3.split(" ");
        System.out.println(Arrays.toString(d));
        System.out.println("Tên: " + d[d.length - 1]);
    }
}
