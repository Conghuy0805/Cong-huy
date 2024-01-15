package ss1_introduction_in_java.thuc_hanh;

import java.util.Scanner;

public class Giai_pt_bac_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập b: ");
        double b = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            if (b == 0) {
                System.out.println("Phương trình có nghiệm = 0");
            } else {
                double x = -b / a;
                System.out.println("Phương trình có nghiệm duy nhất: " + x);
            }
        }
    }
}
