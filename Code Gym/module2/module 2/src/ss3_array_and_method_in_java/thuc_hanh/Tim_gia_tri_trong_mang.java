package ss3_array_and_method_in_java.thuc_hanh;

import java.util.Scanner;

public class Tim_gia_tri_trong_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] student = {"Huy", "Phúc", "Nguyên"};
        System.out.print("Nhập tên sinh viên: ");
        String name = sc.nextLine();
        int count = 0;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(name)) {
                System.out.print("Tên sinh viên " + name + " ở vị trí thứ " + (i + 1));
                count++;
            }
        }
        if (count == 0) {
            System.out.print("Không tồn tại sinh viên trong danh sách");
        }
    }
}
