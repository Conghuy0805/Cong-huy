package Thi.until;

import Thi.model.SanPhamNhapKhau;

import java.io.*;
import java.util.ArrayList;

public class ReadFileSPNK {
    private static final String FILE_PATH = "D:\\Code Gym\\module2\\module 2\\src\\Thi\\data\\spnk.csv";
    private static ArrayList<SanPhamNhapKhau> list = new ArrayList<>();

    public static ArrayList<SanPhamNhapKhau> readfileSnpk() {
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
                String giaNhapKhau = str[6];
                String tinhNhapKhau = str[7];
                String thueNhapKhau = str[8];
                SanPhamNhapKhau spnk = new SanPhamNhapKhau(id, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat, giaNhapKhau, tinhNhapKhau, thueNhapKhau);
                list.add(spnk);
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
