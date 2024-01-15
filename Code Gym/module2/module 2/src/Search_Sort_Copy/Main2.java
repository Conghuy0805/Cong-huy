package Search_Sort_Copy;

import Compareto.SinhVien;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        SinhVien sinhVien1 = new SinhVien(1, "Nguyễn Văn A", "C03", 8);
        SinhVien sinhVien2 = new SinhVien(2, "Nguyễn Văn B", "C04", 10);
        SinhVien sinhVien3 = new SinhVien(3, "Nguyễn Văn", "C04", 7);
        SinhVien sinhVien4 = new SinhVien(3, "Nguyễn Văn C", "C04", 7);

        SinhVien[] a_sv = new SinhVien[]{sinhVien1, sinhVien2, sinhVien3};
        System.out.println("Mảng ban đầu: " + "\n" + Arrays.toString(a_sv));

        // Hàm sắp xếp
        Arrays.sort(a_sv);
        System.out.println("Mảng sau khi sắp xếp:" + "\n" + Arrays.toString(a_sv));
        System.out.println();

        // Hàm tìm kiếm
        System.out.println("Tìm kiếm A: " + Arrays.binarySearch(a_sv, sinhVien1));
        System.out.println("Tìm kiếm C: " + Arrays.binarySearch(a_sv, sinhVien4));
    }
}
