package CaseStudy_Module2.controller;

import CaseStudy_Module2.service.EmployeeService;
import CaseStudy_Module2.service.IEmployeeService;

import java.util.Scanner;

public class EmployeeController {
    public void displayMenu() {
        Scanner sc = new Scanner(System.in);
        int choose;
        IEmployeeService iEmployeeService;
        do {

            System.out.println("========== Menu ==========");
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management ");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit");
            System.out.println("Mời bạn chọn chức năng: ");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    int n;
                    do {
                        System.out.println("@========================MENU========================@");
                        System.out.println("|1. Display list employees                           |");
                        System.out.println("|2. Add new employee                                 |");
                        System.out.println("|3. Edit employee                                    |");
                        System.out.println("|4. Return main menu                                 |");
                        System.out.println("@====================================================@");
                        System.out.println("--> Nhập lựa chọn của bạn:");
                        n = Integer.parseInt(sc.nextLine());
                        iEmployeeService = new EmployeeService();
                        switch (n) {
                            case 1:
                                iEmployeeService.display();
                                break;
                            case 2:
                                iEmployeeService.add();
                                break;
                            case 3:
                                iEmployeeService.edit();
                                iEmployeeService.display();
                            case 4:
                                System.out.println("Return main menu:");
                        }
                    } while (choose >= 1 && choose <= 4);
                    break;
            }
        } while (choose >= 1 && choose <= 5);
    }
}

