package QuanLiDienThoai.until;

import QuanLiDienThoai.model.PhoneManagement;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PhoneManagementWriteFile {
    private static final String FILE_PATH = "D:\\Code Gym\\module2\\module 2\\src\\QuanLiDienThoai\\data\\PhoneManagement.csv";

    public static ArrayList<PhoneManagement> writeFile(ArrayList<PhoneManagement> listphone) {
        File file = new File(FILE_PATH);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (PhoneManagement ch : listphone) {
                bufferedWriter.write(ch.getId() + "," + ch.getTen() + "," + ch.getGia() + "," + ch.getNhaSanXuat());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listphone;
    }
}
