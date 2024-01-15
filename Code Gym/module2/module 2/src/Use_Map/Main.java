package Use_Map;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TuDien tuDien = new TuDien();
        int choose = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("@========================MENU========================@");
            System.out.println("|1. Thêm từ (Từ khóa, ý nghĩa).                      |");
            System.out.println("|2. Xóa từ.                                          |");
            System.out.println("|3. Tìm ý nghĩa của từ khóa -> Tra từ.               |");
            System.out.println("|4. In ra danh sách từ khóa.                         |");
            System.out.println("|5. In ra số lượng từ.                               |");
            System.out.println("|6. Xóa tất cả từ khóa.                              |");
            System.out.println("|0. Thoát khỏi chương trình!                         |");
            System.out.println("@====================================================@");
            System.out.println("--> Nhập lựa chọn của bạn:");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Nhập vào từ khóa: ");
                    String tuKhoa = sc.nextLine();
                    System.out.println("Nhập vào ý nghĩa: ");
                    String yNghia = sc.nextLine();
                    tuDien.themTu(tuKhoa, yNghia);
                    break;
                case 2:
                    System.out.println("Nhập vào từ khóa: ");
                    String tuKhoa2 = sc.nextLine();
                    tuDien.xoaTu(tuKhoa2);
                    break;
                case 3:
                    System.out.println("Nhập vào từ khóa: ");
                    String tuKhoa3 = sc.nextLine();
                    System.out.println("Ý nghĩa là: " + tuDien.traTu(tuKhoa3));
                    break;
                case 4:
                    tuDien.inTuKhoa();
                    break;
                case 5:
                    System.out.println("Số lượng từ: " + tuDien.inSoluong());
                    break;
                case 6:
                    tuDien.xoaTatCa();
                    break;
                default:
                    System.exit(0);
            }
        } while (choose != 0);

    }
}
