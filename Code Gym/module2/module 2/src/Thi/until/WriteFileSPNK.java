package Thi.until;

import Thi.model.SanPham;
import Thi.model.SanPhamNhapKhau;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteFileSPNK {
    public static final String FILE_PATH = "D:\\Code Gym\\module2\\module 2\\src\\Thi\\data\\spnk.csv";

    public static ArrayList<SanPhamNhapKhau> writefile(ArrayList<SanPhamNhapKhau> spnk) {
        File file = new File(FILE_PATH);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (SanPhamNhapKhau ch : spnk) {
                bufferedWriter.write(ch.getId() + "," + ch.getMaSanPham() + "," + ch.getTenSanPham() + "," + ch.getGiaBan() + "," + ch.getSoLuong() + "," + ch.getNhaSanXuat() + "," + ch.getGiaNhapKhau() + "," + ch.getTinhThanhNhap() + "," + ch.getThueNhapKhau());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return spnk;
    }

}
