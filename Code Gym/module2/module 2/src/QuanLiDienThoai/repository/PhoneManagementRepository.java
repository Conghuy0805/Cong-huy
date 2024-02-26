package QuanLiDienThoai.repository;

import QuanLiDienThoai.model.PhoneManagement;
import QuanLiDienThoai.until.PhoneManagementReadFile;
import QuanLiDienThoai.until.PhoneManagementWriteFile;

import java.util.ArrayList;

public class PhoneManagementRepository implements IPhoneManagementRepository{
    static int size;
    @Override
    public ArrayList<PhoneManagement> readfile() {
        return PhoneManagementReadFile.readFile();
    }

    @Override
    public int getSize() {
        return size++;

    }

    @Override
    public ArrayList<PhoneManagement> writefile(ArrayList<PhoneManagement> list) {
        return PhoneManagementWriteFile.writeFile(list);
    }
}
