package ss3_array_and_method_in_java.thuc_hanh;

import java.util.Scanner;

public class Chuyen_doi_nhiet_do {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f;
        double c;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1.Đổi độ F sang độ C.");
            System.out.println("2.Đổi độ C sang độ F.");
            System.out.println("0.Exit.");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Nhập độ F: ");
                    f = Double.parseDouble(sc.nextLine());
                    System.out.print("Độ F sang độ C là: " + doF_to_doC(f) + "\n");
                    break;
                case 2:
                    System.out.print("Nhập độ C: ");
                    c = Double.parseDouble(sc.nextLine());
                    System.out.print("Độ C sang độ F là: " + doC_to_doF(c) + "\n");
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static double doF_to_doC(double f) {
        double c = (5.0 / 9) * (f - 32);
        return c;
    }

    public static double doC_to_doF(double c) {
        double f = (9.0 / 5) * c + 32;
        return f;
    }
}
