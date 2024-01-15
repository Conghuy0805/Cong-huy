package ss1_introduction_in_java.thuc_hanh;

import java.util.Scanner;

public class Kiem_tra_nam_nhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Nhập năm bạn muốn kiểm tra");
        year = sc.nextInt();
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            System.out.println(year + " là năm nhuận");
        } else {
            System.out.println(year + " là năm không nhuận");
        }
    }
}
