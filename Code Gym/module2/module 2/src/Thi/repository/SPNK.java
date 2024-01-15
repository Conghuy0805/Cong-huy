package Thi.repository;

import Thi.model.SanPhamNhapKhau;
import Thi.until.ReadFileSPNK;
import Thi.until.WriteFileSPNK;

import java.util.ArrayList;

public class SPNK implements IspnkRepo {


    @Override
    public ArrayList<SanPhamNhapKhau> readfile() {
        return ReadFileSPNK.readfileSnpk();
    }

    @Override
    public ArrayList<SanPhamNhapKhau> writefile(ArrayList<SanPhamNhapKhau> list) {
        return WriteFileSPNK.writefile(list);
    }


}
