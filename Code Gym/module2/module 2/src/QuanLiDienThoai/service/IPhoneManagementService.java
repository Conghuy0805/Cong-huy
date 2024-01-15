package QuanLiDienThoai.service;

public interface IPhoneManagementService {
    void display();
    void add();
    void delete(int id);
    void searchByName(String name);
    void searchByPrice(double salary);

}
