package Thi.controller;

import Thi.service.ISpnkService;
import Thi.service.SpnkService;

import java.util.Scanner;

public class SpnkContro {
    public void displayMenu() {
        Scanner sc = new Scanner(System.in);
        ISpnkService iSpnkService;
        int choose;
        do {
            System.out.println("@========================MENU========================@");
            System.out.println("|1. Thêm mới sản phẩm.                               |");
            System.out.println("|2. Xóa sản phẩm.                                    |");
            System.out.println("|3. Xem danh sách các sản phẩm.                      |");
            System.out.println("|4. Tìm kiếm theo id, theo mã sản phẩm.              |");
            System.out.println("|5. Thoát chương trình.                              |");
            System.out.println("@====================================================@");
            System.out.println("--> Nhập lựa chọn của bạn:");
            choose = Integer.parseInt(sc.nextLine());
            iSpnkService = new SpnkService();
            switch (choose) {
                case 1:
                    iSpnkService.add();
                    break;
                case 2:
                    System.out.println("Nhập id");
                    int id = Integer.parseInt(sc.nextLine());
                    iSpnkService.delete(id);
                case 3:
                    iSpnkService.display();
                    break;
                case 4:
                    int luachon = 0;
                    do {
                        System.out.println("1. Tìm kiếm theo id");
                        System.out.println("2. Tìm kiếm theo mã sản phẩm");
                        luachon = Integer.parseInt(sc.nextLine());
                        if (luachon == 1) {
                            System.out.println("Nhập id muốn tìm kiếm: ");
                            int idChoose1 = Integer.parseInt(sc.nextLine());
                            iSpnkService.searchById(idChoose1);
                            break;
                        }
                        if (luachon == 2) {
                            System.out.println("Nhập id muốn tìm kiếm: ");
                            String idChoose2 = sc.nextLine();
                            iSpnkService.searchByMaSp(idChoose2);
                            break;
                        }
                    } while (luachon >= 1 && luachon <= 2);
                    break;
            }
        } while (choose != 5);
    }
}
