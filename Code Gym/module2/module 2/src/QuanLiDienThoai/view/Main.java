package QuanLiDienThoai.view;

import QuanLiDienThoai.controller.PhoneManagementController;

public class Main {
    public static void main(String[] args) {
        PhoneManagementController phoneManagementController = new PhoneManagementController();
        phoneManagementController.displayMenu();
    }
}
