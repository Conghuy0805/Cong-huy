package Thi.until;

import Thi.model.SanPhamNhapKhau;
import Thi.model.SanPhamXuatKhau;

import java.io.*;
import java.util.ArrayList;

public class ReadFileSPXK {
    private static final String FILE_PATH = "D:\\Code Gym\\module2\\module 2\\src\\Thi\\data\\spxk.csv";
    private static ArrayList<SanPhamXuatKhau> list = new ArrayList<>();

    public static ArrayList<SanPhamXuatKhau> readfileSnxk() {
        File file = new File(FILE_PATH);

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            String[] str;
            while ((line = bufferedReader.readLine()) != null) {
                str = line.split(",");
                int id = Integer.parseInt(str[0]);
                String maSanPham = str[1];
                String tenSanPham = str[2];
                double giaBan = Double.parseDouble(str[3]);
                int soLuong = Integer.parseInt(str[4]);
                String nhaSanXuat = str[5];
                String giaXuatKhau = str[6];
                String quocGiaNhapKhau = str[7];
                SanPhamXuatKhau spxk = new SanPhamXuatKhau(id, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat, giaXuatKhau, quocGiaNhapKhau);
                list.add(spxk);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException();
        }
        return list;
    }
}
