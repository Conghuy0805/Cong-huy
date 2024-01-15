package ss3_array_and_method_in_java.thuc_hanh;

import java.util.Scanner;

public class Dem_so_luong_sv_thi_do {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] arr;
        do {
            System.out.print("Nhập kích thước: ");
            size = Integer.parseInt(sc.nextLine());
            if (size > 30) {
                System.out.print("Kích thước không được quá 30!");
            }
        } while (size > 30);
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập điểm của sinh viên thứ " + (i + 1) + " : ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        int count = 0;
        System.out.print("Danh sách đánh dấu: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " \t");
            if (arr[i] >= 5 && arr[i] <= 10) {
                count++;
            }
        }
        System.out.println();
        System.out.print("Số học sinh thi đạt là: " + count);
    }
}
