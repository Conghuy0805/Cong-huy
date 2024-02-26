package Thi2.until;


import Thi2.model.PhoneXachTay;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteFileXT {
    public static final String FILE_PATH = "D:\\Code Gym\\module2\\module 2\\src\\Thi2\\data\\phoneXT.csv";

    public static ArrayList<PhoneXachTay> writefile(ArrayList<PhoneXachTay> xachTays) {
        File file = new File(FILE_PATH);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (PhoneXachTay ch : xachTays) {
                bufferedWriter.write(ch.getId() + "," + ch.getTenPhone() + "," + ch.getGiaBan() + "," + ch.getSoLuong() + "," + ch.getNhaSanXuat() + "," + ch.getQuocGiaXT() + "," + ch.getTrangThai());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return xachTays;
    }
}
