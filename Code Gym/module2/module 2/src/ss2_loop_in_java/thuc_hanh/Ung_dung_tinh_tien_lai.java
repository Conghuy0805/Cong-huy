package ss2_loop_in_java.thuc_hanh;

import java.util.Scanner;

public class Ung_dung_tinh_tien_lai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money;
        int month;
        double interestRate;
        System.out.println("Nhập số tiền cho vay: ");
        money = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập số tháng: ");
        month = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tỉ lệ lãi suât theo tháng: ");
        interestRate = Double.parseDouble(sc.nextLine());
        double total = 0;
        for (int i = 0; i < month; i++) {
            total += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Tổng tiền lãi: " + total);
    }
}
