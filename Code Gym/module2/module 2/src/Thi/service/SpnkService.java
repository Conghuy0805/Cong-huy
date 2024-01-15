package Thi.service;


import QuanLiDienThoai.model.PhoneManagement;
import QuanLiDienThoai.until.PhoneManagementWriteFile;
import Thi.model.SanPhamNhapKhau;
import Thi.repository.IspnkRepo;
import Thi.repository.SPNK;
import Thi.until.WriteFileSPNK;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SpnkService implements ISpnkService {
    static Scanner sc = new Scanner(System.in);
    static IspnkRepo ispnkRepo = new SPNK();
    static ArrayList<SanPhamNhapKhau> list = ispnkRepo.readfile();

    @Override
    public void display() {
        for (SanPhamNhapKhau spnk : list) {
            System.out.println(spnk);
        }

    }

    @Override
    public void add() {
        System.out.println("Nhập mã sản phẩm: ");
        String maSanPham = sc.nextLine();
        String nameSanPham = tenSanPham();
        double price = giaSanPham();
        System.out.println("Nhập số lượng: ");
        int soLuong = Integer.parseInt(sc.nextLine());
        String nameNhaSanXuat = tenNhaSanXuat();
        String giaNhapKhau = String.valueOf(giaNhapKhau());
        System.out.println("Nhập tỉnh thành nhập khẩu: ");
        String tinhThanhNhap = sc.nextLine();
        String thue = thue();
        SanPhamNhapKhau spnk = new SanPhamNhapKhau(list.size() + 1, maSanPham, nameSanPham, price, soLuong, nameNhaSanXuat, giaNhapKhau, tinhThanhNhap, thue);
        list.add(spnk);
        WriteFileSPNK.writefile(list);


    }

    @Override
    public void delete(int id) {
        SanPhamNhapKhau spnkRemove = null;
        for (SanPhamNhapKhau ch : list) {
            if (ch.getId() == id) {
                spnkRemove = ch;
                break;
            }
        }
        if (spnkRemove != null) {
            list.remove(spnkRemove);
            System.out.println("Sản phẩm đã được xóa thành công.");
        } else {
            System.out.println("Không tìm thấy sản phẩm!");
        }
        WriteFileSPNK.writefile(list);
    }

    @Override
    public void searchById(int id) {
        for (SanPhamNhapKhau ch : list) {
            if (ch.getId() == id) {
                System.out.println(ch);
            }
        }
    }

    @Override
    public void searchByMaSp(String maSP) {
        for (SanPhamNhapKhau ch : list) {
            if (ch.getMaSanPham().equalsIgnoreCase(maSP)) {
                System.out.println(ch);
            }
        }
    }


    public static String tenSanPham() {
        while (true) {
            System.out.println("Nhập tên sản phẩm: ");
            String nameSanPham = sc.nextLine();
            String regex = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$";
            if (Pattern.matches(regex, nameSanPham)) {
                return nameSanPham;
            } else {
                System.out.println("Sai định dạng!!! Hãy nhập lại");
            }
        }
    }

    public static double giaNhapKhau() {
        while (true) {
            System.out.println("Nhập giá nhập khẩu: ");
            String giaSanPhamStr = sc.nextLine();
            String regex = "^\\d+(\\.\\d{1,2})?$";
            if (Pattern.matches(regex, giaSanPhamStr)) {
                double giaSanPham = Double.parseDouble(giaSanPhamStr);
                return giaSanPham;
            } else {
                System.out.println("Sai định dạng!!! Hãy nhập lại");
            }

        }
    }

    public static double giaSanPham() {
        while (true) {
            System.out.println("Nhập giá sản phẩm: ");
            String giaSanPhamStr = sc.nextLine();
            String regex = "^\\d+(\\.\\d{1,2})?$";
            if (Pattern.matches(regex, giaSanPhamStr)) {
                double giaSanPham = Double.parseDouble(giaSanPhamStr);
                return giaSanPham;
            } else {
                System.out.println("Sai định dạng!!! Hãy nhập lại");
            }

        }
    }

    public static String tenNhaSanXuat() {
        while (true) {
            System.out.println("Nhập tên nhà sản xuất:");
            String nameNhaSanXuat = sc.nextLine();
            String regex = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$";
            if (Pattern.matches(regex, nameNhaSanXuat)) {
                return nameNhaSanXuat;
            } else {
                System.out.println("Sai định dạng!!! Hãy nhập lại");
            }
        }
    }

    public static String thue() {
        while (true) {
            System.out.println("Nhập thuế: ");
            String thue = sc.nextLine();
            String regex = "^[0-9]{2}$";
            if (Pattern.matches(regex, thue)) {
                return thue;
            } else {
                System.out.println("Sai định dạng!!! Hãy nhập lại");
            }
        }
    }
}
