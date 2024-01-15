package QuanLiDanhSachSinhVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int choose = 0;
        do {
            System.out.println(" ==========MENU==========");
            System.out.println("- Vui lòng chọn chức năng - ");
            System.out.println("1. Thêm sinh viên vào danh sách. ");
            System.out.println("2. In danh sách sinh viên. ");
            System.out.println("3. Kiểm tra danh sách có rỗng hay không. ");
            System.out.println("4. Lấy ra số lượng sinh viên trong danh sách. ");
            System.out.println("5. làm rỗng danh sách sinh viên. ");
            System.out.println("6. Kiểm tra sinh viên có tồn tại trong danh sách không, dựa trên mã sinh viên. ");
            System.out.println("7. Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên. ");
            System.out.println("8. Tìm kiếm tất cả sinh viên dựa trên tên đã được nhập từ bàn phím. ");
            System.out.println("9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp. ");
            System.out.println("0. Thoát khỏi chương trình! ");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Nhập mã sinh viên:  ");
                    int maSinhVien = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập họ và tên:  ");
                    String hoVaTen = sc.nextLine();
                    System.out.println("Nhập năm sinh:  ");
                    int namSinh = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập điểm trung bình:  ");
                    float diemTb = Float.parseFloat(sc.nextLine());

                    SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTb);
                    dssv.themSinhVien(sv);
                    break;
                case 2:
                    System.out.println("Danh sách sinh viên: ");
                    dssv.inDanhSachSinhVien();
                    break;
                case 3:
                    System.out.println("Danh sách rỗng: " + dssv.kiemTraDanhSachRong());
                    break;
                case 4:
                    System.out.println("Số lượng sinh viên hiện tại: " + dssv.laySoLuongSinhVien());
                    break;
                case 5:
                    dssv.lamRongDanhSach();
                    break;
                case 6:
                    System.out.println("Nhập mã sinh viên để kiểm tra: ");
                    int index_check = Integer.parseInt(sc.nextLine());
                    dssv.kiemTraTonTai(index_check);
                    break;
                case 7:
                    System.out.println("Nhập mã sinh viên muốn xóa: ");
                    int index = Integer.parseInt(sc.nextLine());
                    dssv.xoaSinhVien(index);
                    break;
                case 8:
                    System.out.println("Nhập tên sinh viên muốn tìm kiếm: ");
                    String nameSv = sc.nextLine();
                    dssv.timKiemSinhVien(nameSv);
                    break;
                case 9:
                    dssv.sapXepSinhVienGiamDanTheoDiem();
                    dssv.inDanhSachSinhVien();
                    break;
                default:
                    System.exit(0);
            }
        } while (choose != 0);
    }
}
