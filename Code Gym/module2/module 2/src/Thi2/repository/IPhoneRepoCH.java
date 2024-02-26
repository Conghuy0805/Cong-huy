package Thi2.repository;

import Thi2.model.PhoneChinhHang;

import java.util.ArrayList;

public interface IPhoneRepoCH {
    ArrayList<PhoneChinhHang> readfile();
    ArrayList<PhoneChinhHang> writefile(ArrayList<PhoneChinhHang> phoneChinhHangs);
}
