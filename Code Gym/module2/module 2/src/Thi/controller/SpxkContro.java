package Thi.controller;

import Thi.service.ISpnkService;
import Thi.service.ISpxkService;
import Thi.service.SpnkService;
import Thi.service.SpxkService;

import java.util.Scanner;

public class SpxkContro {
    public void displayMenu(){
        Scanner sc  = new Scanner(System.in);
        ISpxkService iSpxkService;
        int choose;
        do {
            System.out.println("@========================MENU========================@");
            System.out.println("|1. Thêm mới sản phẩm.                               |");
            System.out.println("|2. Xóa sản phẩm.                                    |");
            System.out.println("|3. Xem danh sách các sản phẩm.                      |");
            System.out.println("|4. Tìm kiếm.                                        |");
            System.out.println("|5. Thoát chương trình.                              |");
            System.out.println("@====================================================@");
            System.out.println("--> Nhập lựa chọn của bạn:");
            choose = Integer.parseInt(sc.nextLine());
            iSpxkService = new SpxkService();
            switch (choose){
                case 1:
                    iSpxkService.add();
                    break;
                case 2:
                    System.out.println("Nhập mã sản phẩm muốn xóa: ");
                    String maSP = sc.nextLine();
                    iSpxkService.delete(maSP);
                case 3:
                    iSpxkService.display();
                    break;
            }
        }while (choose!=5);
    }
}
