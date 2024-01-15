package Thi2.until;

import Thi2.model.PhoneChinhHang;
import Thi2.model.PhoneXachTay;

import java.io.*;
import java.util.ArrayList;

public class ReadFileXT {
    private static final String FILE_PATH = "D:\\Code Gym\\module2\\module 2\\src\\Thi2\\data\\phoneXT.csv";
    private static ArrayList<PhoneXachTay> list = new ArrayList<>();

    public static ArrayList<PhoneXachTay> readfileXT() {
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
                String quocGiaXT = str[5];
                String trangThai = str[6];
                PhoneXachTay phoneXachTay = new PhoneXachTay(id, tenPhone, giaBan, soLuong, nhaSanXuat, quocGiaXT, trangThai);
                list.add(phoneXachTay);
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
