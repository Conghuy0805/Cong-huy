package QuanLiDienThoai.repository;

import QuanLiDienThoai.model.PhoneManagement;

import java.util.ArrayList;

public interface IPhoneManagementRepository {
    ArrayList<PhoneManagement> readfile();
    int getSize();
    ArrayList<PhoneManagement> writefile(ArrayList<PhoneManagement> list);


}
