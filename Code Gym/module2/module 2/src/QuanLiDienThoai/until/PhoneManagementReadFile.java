package QuanLiDienThoai.until;

import QuanLiDienThoai.model.PhoneManagement;

import java.io.*;
import java.util.ArrayList;

public class PhoneManagementReadFile {
    private static final String FILE_PATH = "D:\\Code Gym\\module2\\module 2\\src\\QuanLiDienThoai\\data\\PhoneManagement.csv";
    static ArrayList<PhoneManagement> listphone = new ArrayList<>();

    public static ArrayList<PhoneManagement> readFile() {
        File file = new File(FILE_PATH);

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String namePhone = temp[1];
                double price = Double.parseDouble(temp[2]);
                String nameProducer = temp[3];
                PhoneManagement phoneManagement = new PhoneManagement(id, namePhone, price, nameProducer);
                listphone.add(phoneManagement);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException();
        }
        return listphone;
    }
}
