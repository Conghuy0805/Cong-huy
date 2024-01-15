package ss2_loop_in_java.thuc_hanh;

import java.util.Scanner;

public class Tim_uoc_so_chung_lon_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Nhập a: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập b: ");
        b = Integer.parseInt(sc.nextLine());
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Không có ước chung lớn nhất");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("Ước chung lớn nhất: " + a);
    }
}
