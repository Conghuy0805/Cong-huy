package Thi.repository;

import Thi.model.SanPhamNhapKhau;

import java.util.ArrayList;

public interface IspnkRepo {
    ArrayList<SanPhamNhapKhau> readfile();
    ArrayList<SanPhamNhapKhau> writefile(ArrayList<SanPhamNhapKhau> list);
}
