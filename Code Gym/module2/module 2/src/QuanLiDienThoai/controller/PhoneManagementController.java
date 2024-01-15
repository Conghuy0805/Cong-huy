package QuanLiDienThoai.controller;

import QuanLiDienThoai.service.IPhoneManagementService;
import QuanLiDienThoai.service.PhoneManagementService;

import java.util.Scanner;

public class PhoneManagementController {

    public void displayMenu() {
        Scanner sc = new Scanner(System.in);
        int choose;
        IPhoneManagementService iPhoneManagementService;
        do {
            System.out.println("@========================MENU========================@");
            System.out.println("|1. Thêm mới sản phẩm.                               |");
            System.out.println("|2. Hiển thị danh sách sản phẩm.                     |");
            System.out.println("|3. Xóa sản phẩm.                                    |");
            System.out.println("|4. Tìm kiếm sản phẩm(theo tên).                     |");
            System.out.println("|5. Tìm kiếm sản phẩm(theo giá).                     |");
            System.out.println("|0. Thoát chương trình.                              |");
            System.out.println("@====================================================@");
            System.out.println("--> Nhập lựa chọn của bạn:");
            choose = Integer.parseInt(sc.nextLine());
            iPhoneManagementService = new PhoneManagementService();
            switch (choose) {
                case 1:
                    iPhoneManagementService.add();
                    break;
                case 2:
                    iPhoneManagementService.display();
                    break;
                case 3:
                    System.out.println("Nhập vào id sản phẩm muốn xóa: ");
                    int id = Integer.parseInt(sc.nextLine());
                    iPhoneManagementService.delete(id);
                    break;
                case 4:
                    String name = sc.nextLine();
                    iPhoneManagementService.searchByName(name);
                    break;
                case 5:
                    System.out.println("Nhập giá muốn tìm: ");
                    double salary = Double.parseDouble(sc.nextLine());
                    iPhoneManagementService.searchByPrice(salary);
                    break;
                default:
                    System.exit(0);
            }
        } while (choose != 0);
    }
}
