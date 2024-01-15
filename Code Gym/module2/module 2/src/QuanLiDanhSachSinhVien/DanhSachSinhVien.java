package QuanLiDanhSachSinhVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> list;

    public DanhSachSinhVien() {
        this.list = new ArrayList<SinhVien>();
    }

    public DanhSachSinhVien(ArrayList<SinhVien> list) {
        this.list = list;
    }

    public void themSinhVien(SinhVien sv) {
        this.list.add(sv);
    }

    public void inDanhSachSinhVien() {
        if (list.isEmpty()) {
            System.out.println("Không có sinh viên nào trong danh sách! ");
        } else {
            for (SinhVien sinhVien : list) {
                System.out.println(sinhVien);
            }
        }
    }

    public boolean kiemTraDanhSachRong() {
        return this.list.isEmpty();
    }

    public int laySoLuongSinhVien() {
        return this.list.size();
    }

    public void lamRongDanhSach() {
        this.list.removeAll(list);
    }

    public void kiemTraTonTai(int mssv) {
        boolean tonTai = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaSinhVien() == mssv) {
                tonTai = true;
                break;
            }
        }
        if (tonTai) {
            System.out.println("Sinh viên có mã là " + mssv + " có trong danh sách");
        } else {
            System.out.println("Sinh viên có mã là " + mssv + " không có trong danh sách");
        }
    }

    public void xoaSinhVien(int index) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaSinhVien() == index) {
                list.remove(i);
                break;
            }
        }
    }

    public void timKiemSinhVien(String name) {
        boolean timThay = false;
        for (SinhVien sinhVien : list) {
            if (sinhVien.getHoVaTen().toLowerCase().contains(name.toLowerCase())) {
                timThay = true;
                System.out.println(sinhVien);
                break;
            }
        }
        if (!timThay) {
            System.out.println("Sinh viên có tên là " + name + " không có trong danh sách!");
        }
    }


    public void sapXepSinhVienGiamDanTheoDiem() {
        Collections.sort(this.list, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if (sv1.getDiemTB() < sv2.getDiemTB()) {
                    return 1;
                } else if (sv1.getDiemTB() > sv2.getDiemTB()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }
}

