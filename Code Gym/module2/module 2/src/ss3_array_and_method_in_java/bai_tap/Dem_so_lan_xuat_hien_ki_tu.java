package ss3_array_and_method_in_java.bai_tap;

import java.util.Scanner;

public class Dem_so_lan_xuat_hien_ki_tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi bất kì: ");
        String str = sc.nextLine();
        char kitu = 'c';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == kitu) {
                count++;
            }
        }
        System.out.print("Kí tự " + kitu + " xuất hiện " + count + " lần");
    }
}
