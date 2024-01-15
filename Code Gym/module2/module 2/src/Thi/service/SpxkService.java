package Thi.service;

import Thi.model.SanPhamNhapKhau;
import Thi.model.SanPhamXuatKhau;
import Thi.repository.IspnkRepo;
import Thi.repository.IspxkRepo;
import Thi.repository.SPNK;
import Thi.repository.SPXK;
import Thi.until.WriteFileSPNK;
import Thi.until.WriteFileSPXK;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SpxkService implements ISpxkService{
    static Scanner sc = new Scanner(System.in);
    static IspxkRepo ispxkRepo = new SPXK();
    static ArrayList<SanPhamXuatKhau> list = ispxkRepo.readfile();

    @Override
    public void display() {
        for (SanPhamXuatKhau spxk : list) {
            System.out.println(spxk);
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
        String giaXuatKhau = String.valueOf(giaXuatKhau());
        System.out.println("Nhập tỉnh thành nhập khẩu: ");
        String tinhThanhNhap = sc.nextLine();
        SanPhamXuatKhau spnk = new SanPhamXuatKhau(list.size() + 1, maSanPham, nameSanPham, price, soLuong, nameNhaSanXuat, giaXuatKhau,tinhThanhNhap);
        list.add(spnk);
        WriteFileSPXK.writefile(list);


    }

    @Override
    public void delete(String maSP) {
        SanPhamXuatKhau spxkRemove = null;
        for (SanPhamXuatKhau ch : list) {
            if (ch.getMaSanPham().equals(maSP)) {
                spxkRemove = ch;
                break;
            }
        }
        if (spxkRemove != null) {
            list.remove(spxkRemove);
            System.out.println("Sản phẩm đã được xóa thành công.");
        } else {
            System.out.println("Không tìm thấy sản phẩm!");
        }
        WriteFileSPXK.writefile(list);
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

    public static double giaXuatKhau() {
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
}
