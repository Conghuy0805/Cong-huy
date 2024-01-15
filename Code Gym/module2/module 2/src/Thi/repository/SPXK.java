package Thi.repository;

import Thi.model.SanPhamXuatKhau;
import Thi.until.ReadFileSPXK;
import Thi.until.WriteFileSPXK;

import java.util.ArrayList;

public class SPXK implements IspxkRepo {
    @Override
    public ArrayList<SanPhamXuatKhau> readfile() {
        return ReadFileSPXK.readfileSnxk();
    }

    @Override
    public ArrayList<SanPhamXuatKhau> writefile(ArrayList<SanPhamXuatKhau> list) {
        return WriteFileSPXK.writefile(list);
    }
}
