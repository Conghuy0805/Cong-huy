package Thi2.until;

import Thi2.model.PhoneChinhHang;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteFileCH {
    public static final String FILE_PATH = "D:\\Code Gym\\module2\\module 2\\src\\Thi2\\data\\phoneCH.csv";

    public static ArrayList<PhoneChinhHang> writefile(ArrayList<PhoneChinhHang> chinhHangs) {
        File file = new File(FILE_PATH);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (PhoneChinhHang ch : chinhHangs) {
                bufferedWriter.write(ch.getId() + "," + ch.getTenPhone() + "," + ch.getGiaBan() + "," + ch.getSoLuong() + "," + ch.getNhaSanXuat() + "," + ch.getTimeBaoHanh() + "," + ch.getPhamViBH());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return chinhHangs;
    }
}
