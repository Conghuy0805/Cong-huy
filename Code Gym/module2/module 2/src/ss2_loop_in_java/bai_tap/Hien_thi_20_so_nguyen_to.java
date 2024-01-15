package ss2_loop_in_java.bai_tap;


public class Hien_thi_20_so_nguyen_to {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; count < 20; i++) {
            int m = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    m = 1;
                }
            }
            if (m == 0) {
                System.out.print(" " + i);
                count++;
            }
        }
    }
}
