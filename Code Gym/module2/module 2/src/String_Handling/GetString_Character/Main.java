package String_Handling.GetString_Character;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        System.out.print("Nhập chuỗi: ");
        s = scanner.nextLine();

        // Hàm length() => lấy ra độ dài chuỗi
        System.out.print("Chuỗi có độ dài: " + s.length());
        int doDai = s.length();
        System.out.println();

        // Hàm charAt(vị trí ) => lấy ra 1 kí tự tại "vị trí"
        for (int i = 0; i < doDai; i++) {
            System.out.println("Vị trí " + i + " là: " + s.charAt(i));
        }

        // Hàm getChars(vị trí bất đầu, vị trí kết thúc, mảng lưu dữ liệu, vị trí bắt đầu lưu của mảng)
        char[] arr = new char[5];
        s.getChars(2, 3, arr, 0);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Giá trị của mảng tại " + i + " là: " + arr[i]);
        }
        // hàm getBytes => có 3 cách, lấy ra giá trị của các kí tự thành 1 mảng
        byte[] arrBytes = s.getBytes();
        for(byte b : arrBytes){
            System.out.println(b);
        }
    }
}
