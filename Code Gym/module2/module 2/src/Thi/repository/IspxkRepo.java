package Thi.repository;

import Thi.model.SanPhamXuatKhau;

import java.util.ArrayList;

public interface IspxkRepo {
    ArrayList<SanPhamXuatKhau> readfile();
    ArrayList<SanPhamXuatKhau> writefile(ArrayList<SanPhamXuatKhau> list);
}
