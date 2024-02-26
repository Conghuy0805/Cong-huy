package Thi2.repository;

import Thi2.model.PhoneChinhHang;
import Thi2.until.ReadFileCH;
import Thi2.until.WriteFileCH;

import java.util.ArrayList;

public class PhoneCHRepo implements IPhoneRepoCH {
    @Override
    public ArrayList<PhoneChinhHang> readfile() {
        return ReadFileCH.readfileCH();
    }

    @Override
    public ArrayList<PhoneChinhHang> writefile(ArrayList<PhoneChinhHang> phoneChinhHangs) {
        return WriteFileCH.writefile(phoneChinhHangs);
    }
}
