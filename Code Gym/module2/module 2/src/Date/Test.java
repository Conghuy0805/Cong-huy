package Date;

import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 5; i++) {
            System.out.println("HELLO");
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Trước khi chạy: " + t1);
        System.out.println("Sau khi chạy: " + t2);
        System.out.println("Thời gian: " + (t2 - t1) + " mls");
        System.out.println("Thời gian: " + ((t2 - t1) / 1000) + " s");

        System.out.println(TimeUnit.DAYS.toSeconds(3000*365));


    }
}
