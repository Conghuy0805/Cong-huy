package Thi2.service;


import Thi2.Exeption.NotFoundProductException;
import Thi2.model.PhoneChinhHang;
import Thi2.model.PhoneXachTay;
import Thi2.repository.IPhoneRepoXT;
import Thi2.repository.PhoneXTRepo;

import Thi2.until.WriteFileXT;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneServiXT implements IPhoneServiXT {
    static Scanner sc = new Scanner(System.in);
    static IPhoneRepoXT iPhoneRepoXT = new PhoneXTRepo();
    static ArrayList<PhoneXachTay> list = iPhoneRepoXT.readfile();

    @Override
    public void display() {
        for (PhoneXachTay phoneXachTay : list) {
            System.out.println(phoneXachTay);
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
        String quocGiaXT = quocGiaXT();
        String trangthai = trangthai();
        PhoneXachTay phoneXachTay = new PhoneXachTay(list.size() + 1, tenDT, giaBan, soLuong, tenNSX, quocGiaXT, trangthai);
        list.add(phoneXachTay);
        WriteFileXT.writefile(list);

    }

    @Override
    public void delete(int id) {
        PhoneXachTay xtRemove = null;
        for (PhoneXachTay ch : list) {
            if (ch.getId() == id) {
                xtRemove = ch;
                break;
            }
        }
        if (xtRemove != null) {
            list.remove(xtRemove);
            System.out.println("Sản phẩm đã được xóa thành công.");
        } else {
            System.out.println("Không tìm thấy sản phẩm!");
        }
        WriteFileXT.writefile(list);
    }

    @Override
    public void seachById(int id) {
        int count = 0;
        for (PhoneXachTay ch : list) {
            if (ch.getId() == id) {
                System.out.println(ch);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy id");
        }
    }

    @Override
    public void searchByMaSP(String maSP) throws NotFoundProductException {
        int count = 0;
        for (PhoneXachTay ch: list){
            if(ch.getTenPhone().equals(maSP)){
                System.out.println(ch);
                count++;
            }
        }
        if (count==0){
            throw new NotFoundProductException("Không tìm thấy sản phẩm");
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

    public static String quocGiaXT() {
        while (true) {
            System.out.println("Nhập quốc gia xách tay: ");
            String quocGiaXt = sc.nextLine();
            String regex = "^(?!Viet Nam$).*";
            if (Pattern.matches(regex, quocGiaXt)) {
                return quocGiaXt;
            } else {
                System.out.println("Sai định dạng!!! Hãy nhập lại");
            }

        }
    }

    public static String trangthai() {
        while (true) {
            System.out.println("Nhập trạng thái: ");
            String trangthai = sc.nextLine();
            String regex = "^(Da sua chua|Chua sua chua)$";
            if (Pattern.matches(regex, trangthai)) {
                return trangthai;
            } else {
                System.out.println("Sai định dạng!!! Hãy nhập lại");
            }

        }
    }

}
