package Thi2.service;


import Thi.model.SanPhamNhapKhau;
import Thi2.model.PhoneChinhHang;
import Thi2.repository.IPhoneRepoCH;
import Thi2.repository.PhoneCHRepo;
import Thi2.until.WriteFileCH;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneServiCH implements IPhoneServiCH {
    static Scanner sc = new Scanner(System.in);
    static IPhoneRepoCH iPhoneRepoCH = new PhoneCHRepo();
    static ArrayList<PhoneChinhHang> list = iPhoneRepoCH.readfile();

    @Override
    public void display() {
        for (PhoneChinhHang phoneChinhHang : list) {
            System.out.println(phoneChinhHang);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập tên điện thoại: ");
        String tenDT = sc.nextLine();
        String giaBan = giaBan();
        String soLuong = soLuong();
        System.out.println("Nhập tên nhà sản xuất: ");
        String tenNSX = sc.nextLine();
        String timeBH = timeBH();
        String phamViBH = phamViBH();
        PhoneChinhHang phoneChinhHang = new PhoneChinhHang(list.size() + 1, tenDT, giaBan, soLuong, tenNSX, timeBH, phamViBH);
        list.add(phoneChinhHang);
        WriteFileCH.writefile(list);
    }

    @Override
    public void delete(int id) {
        PhoneChinhHang chRemove = null;
        for (PhoneChinhHang ch : list) {
            if (ch.getId() == id) {
                chRemove = ch;
                break;
            }
        }
        if (chRemove != null) {
            list.remove(chRemove);
            System.out.println("Sản phẩm đã được xóa thành công.");
        } else {
            System.out.println("Không tìm thấy sản phẩm!");
        }
        WriteFileCH.writefile(list);
    }

    @Override
    public void seachById(int id) {
        int count = 0;
        for (PhoneChinhHang ch : list) {
            if (ch.getId() == id) {
                System.out.println(ch);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy id");
        }
    }

    public static String giaBan() {
        while (true) {
            System.out.println("Nhập giá bán: ");
            String giaBan = sc.nextLine();
            String regex = "^\\d+(\\.\\d+)?$";
            if (Pattern.matches(regex, giaBan)) {
                return giaBan;
            } else {
                System.out.println("Sai định dạng!!! Hãy nhập lại");
            }

        }
    }

    public static String soLuong() {
        while (true) {
            System.out.println("Nhập số lượng: ");
            String soLuong = sc.nextLine();
            String regex = "^\\d+(\\.\\d+)?$";
            if (Pattern.matches(regex, soLuong)) {
                return soLuong;
            } else {
                System.out.println("Sai định dạng!!! Hãy nhập lại");
            }

        }
    }

    public static String timeBH() {
        while (true) {
            System.out.println("Nhập thời gian bảo hành: ");
            String timeBH = sc.nextLine();
            String regex = "^(?:[1-6]\\d{2}|[1-9]\\d|[1-9])$|^(?:[1-6]\\d{2}|[1-9]\\d|[1-9][0-9]{0,1}|7[0-2][0-9]|730)$";
            if (Pattern.matches(regex, timeBH)) {
                return timeBH;
            } else {
                System.out.println("Sai định dạng!!! Hãy nhập lại");
            }

        }
    }

    public static String phamViBH() {
        while (true) {
            System.out.println("Nhập phạm vi bảo hành: ");
            String phamviBH = sc.nextLine();
            String regex = "^(Toan Quoc|Quoc Te)$";
            if (Pattern.matches(regex, phamviBH)) {
                return phamviBH;
            } else {
                System.out.println("Sai định dạng!!! Hãy nhập lại");
            }

        }
    }


}
