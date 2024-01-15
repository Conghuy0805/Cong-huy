package Thi2.until;

import Thi2.model.PhoneChinhHang;

import java.io.*;
import java.util.ArrayList;

public class ReadFileCH {
    private static final String FILE_PATH = "D:\\Code Gym\\module2\\module 2\\src\\Thi2\\data\\phoneCH.csv";
    private static ArrayList<PhoneChinhHang> list = new ArrayList<>();

    public static ArrayList<PhoneChinhHang> readfileCH() {
        File file = new File(FILE_PATH);

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            String[] str;
            while ((line = bufferedReader.readLine()) != null) {
                str = line.split(",");
                int id = Integer.parseInt(str[0]);
                String tenPhone = str[1];
                String giaBan = str[2];
                String soLuong = str[3];
                String nhaSanXuat = str[4];
                String timeBaoHanh = str[5];
                String phamviBH = str[6];
                PhoneChinhHang phoneChinhHang = new PhoneChinhHang(id, tenPhone, giaBan, soLuong, nhaSanXuat, timeBaoHanh, phamviBH);
                list.add(phoneChinhHang);
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
