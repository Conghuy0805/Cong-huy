package Thi2.controller;

import Thi2.Exeption.NotFoundProductException;
import Thi2.service.IPhoneServiXT;
import Thi2.service.PhoneServiXT;

import java.util.Scanner;

public class PhoneXTContro {
    public void displayMenu() throws NotFoundProductException {
        Scanner sc = new Scanner(System.in);
        IPhoneServiXT iPhoneServiXT;
        int choose;
        do {
            System.out.println("@========================MENU========================@");
            System.out.println("|1. Thêm mới.                                        |");
            System.out.println("|2. Xóa.                                             |");
            System.out.println("|3. Xem danh sách điện thoại.                        |");
            System.out.println("|4. Tìm kiếm.                                        |");
            System.out.println("|5. Thoát chương trình.                              |");
            System.out.println("@====================================================@");
            System.out.println("--> Nhập lựa chọn của bạn:");
            choose = Integer.parseInt(sc.nextLine());
            iPhoneServiXT = new PhoneServiXT();
            switch (choose) {
                case 1:
                    iPhoneServiXT.add();
                    break;
                case 2:
                    System.out.println("Nhập id muốn xóa: ");
                    int id = Integer.parseInt(sc.nextLine());
                    iPhoneServiXT.delete(id);
                    break;
                case 3:
                    iPhoneServiXT.display();
                    break;
                case 4:
                    System.out.println("1. Tìm kiếm theo id. ");
                    System.out.println("2. Tìm kiếm theo mã sảm phẩm. ");
                    System.out.println("--> Nhập lựa chọn của bạn: ");
                    int luachon = Integer.parseInt(sc.nextLine());
                    switch (luachon) {
                        case 1:
                            System.out.println("Nhập id bạn muốn tìm kiếm: ");
                            int idSearch = Integer.parseInt(sc.nextLine());
                            iPhoneServiXT.seachById(idSearch);
                            break;
                        case 2:
                            System.out.println("Nhập tên sản phẩm muốn tìm kiếm: ");
                            String nameSearch = sc.nextLine();
                            iPhoneServiXT.searchByMaSP(nameSearch);
                            break;
                    }
                    break;

                default:
                    System.exit(0);
            }
        } while (choose != 5);
    }
}
