package Thi.until;

import Thi.model.SanPhamNhapKhau;
import Thi.model.SanPhamXuatKhau;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteFileSPXK {
    public static final String FILE_PATH = "D:\\Code Gym\\module2\\module 2\\src\\Thi\\data\\spxk.csv";

    public static ArrayList<SanPhamXuatKhau> writefile(ArrayList<SanPhamXuatKhau> spxk) {
        File file = new File(FILE_PATH);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (SanPhamXuatKhau ch : spxk) {
                bufferedWriter.write(ch.getId() + "," + ch.getMaSanPham() + "," + ch.getTenSanPham() + "," + ch.getGiaBan() + "," + ch.getSoLuong() + "," + ch.getNhaSanXuat() + "," + ch.getGiaXuatKhau() + "," + ch.getQuocGiaNhapSP());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return spxk;
    }
}
