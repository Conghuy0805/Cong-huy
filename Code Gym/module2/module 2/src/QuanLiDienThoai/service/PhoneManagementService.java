package QuanLiDienThoai.service;

import QuanLiDienThoai.model.PhoneManagement;
import QuanLiDienThoai.repository.IPhoneManagementRepository;
import QuanLiDienThoai.repository.PhoneManagementRepository;
import QuanLiDienThoai.until.PhoneManagementWriteFile;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneManagementService implements IPhoneManagementService {

    static Scanner sc = new Scanner(System.in);
    static IPhoneManagementRepository phoneManagementRepository = new PhoneManagementRepository();
    static ArrayList<PhoneManagement> phoneManagements = phoneManagementRepository.readfile();

    @Override
    public void display() {
        for (PhoneManagement phone : phoneManagements) {
            System.out.println(phone);
        }
    }

    @Override
    public void add() {
        String nameSanPham = tenSanPham();
        double price = giaSanPham();
        String nameNhaSanXuat = tenNhaSanXuat();
        PhoneManagement phoneManagementnew = new PhoneManagement(phoneManagements.size() + 1, nameSanPham, price, nameNhaSanXuat);
        phoneManagements.add(phoneManagementnew);
        phoneManagementRepository.writefile(phoneManagements);


    }

    @Override
    public void delete(int idSanPham) {
        PhoneManagement phoneManagementRemove = null;
        for (PhoneManagement ch : phoneManagements) {
            if (ch.getId() == idSanPham) {
                phoneManagementRemove = ch;
                break;
            }
        }
        if (phoneManagementRemove != null) {
            phoneManagements.remove(phoneManagementRemove);
            System.out.println("Sản phẩm đã được xóa thành công.");
        } else {
            System.out.println("Không tìm thấy sản phẩm!");
        }
        PhoneManagementWriteFile.writeFile(phoneManagements);
    }

    @Override
    public void searchByName(String name) {
        while (true) {
            System.out.println("Nhập tên muốn tìm: ");
            name = sc.nextLine();
            int count = 0;
            for (PhoneManagement list : phoneManagements) {
                if (list.getTen().equalsIgnoreCase(name)) {
                    System.out.println(list);
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Tên không tồn tại");
            } else {
                System.out.println("Tìm kiếm thành công");
                return;
            }
        }
    }

    @Override
    public void searchByPrice(double salary) {
        while (true) {
            int count = 0;
            for (PhoneManagement list : phoneManagements) {
                if (list.getGia() == salary) {
                    System.out.println(list);
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Không tìm thấy giá tương ứng");
            } else {
                System.out.println("Tìm kiếm thành công");
                return;
            }
        }
    }

    public static String tenNhaSanXuat() {
        while (true) {
            System.out.println("Nhập tên nhà sản xuất:");
            String nameNhaSanXuat = sc.nextLine();
            String regex = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$";
            if (Pattern.matches(regex, nameNhaSanXuat)) {
                return nameNhaSanXuat;
            } else {
                System.out.println("Sai định dạng!!! Hãy nhập lại");
            }
        }
    }

    public static String tenSanPham() {
        while (true) {
            System.out.println("Nhập tên sản phẩm: ");
            String nameSanPham = sc.nextLine();
            String regex = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$";
            if (Pattern.matches(regex, nameSanPham)) {
                return nameSanPham;
            } else {
                System.out.println("Sai định dạng!!! Hãy nhập lại");
            }
        }
    }

    public static double giaSanPham() {
        while (true) {
            System.out.println("Nhập giá sản phẩm: ");
            String giaSanPhamStr = sc.nextLine();
            String regex = "^\\d+(\\.\\d{1,2})?$";
            if (Pattern.matches(regex, giaSanPhamStr)) {
                double giaSanPham = Double.parseDouble(giaSanPhamStr);
                return giaSanPham;
            } else {
                System.out.println("Sai định dạng!!! Hãy nhập lại");
            }

        }
    }
}
