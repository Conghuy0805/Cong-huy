package Thi2.controller;

import Thi2.service.IPhoneServiCH;
import Thi2.service.PhoneServiCH;


import java.util.Scanner;

public class PhoneCHContro {
    public void displayMenu(){
        Scanner sc = new Scanner(System.in);
        IPhoneServiCH iPhoneServiCH ;
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
            iPhoneServiCH = new PhoneServiCH();
            switch (choose){
                case 1:
                    iPhoneServiCH.add();
                    break;
                case 2:
                    System.out.println("Nhập id muốn xóa: ");
                    int id = Integer.parseInt(sc.nextLine());
                    iPhoneServiCH.delete(id);
                    break;
                case 3:
                    iPhoneServiCH.display();
                    break;
                case 4:
                    System.out.println("Nhập id muốn tìm kiếm: ");
                    int idSearch = Integer.parseInt(sc.nextLine());
                    iPhoneServiCH.seachById(idSearch);
                    break;
                default:
                    System.exit(0);
            }
        }while (choose != 5);
    }
}
