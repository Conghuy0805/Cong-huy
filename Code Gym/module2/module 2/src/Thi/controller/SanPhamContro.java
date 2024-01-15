package Thi.controller;

import java.util.Scanner;

public class SanPhamContro {
    static Scanner sc = new Scanner(System.in);
    public void menu(){
        int choose;
        do {
            System.out.println("Menu:");
            System.out.println("1. Sản phẩm nhập khẩu. ");
            System.out.println("2. Sản phẩm xuất khẩu.");
            System.out.println("3. Exit.");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    SpnkContro spnkContro = new SpnkContro();
                    spnkContro.displayMenu();
                    break;
                case 2:
                    SpxkContro spxkContro  = new SpxkContro();
                    spxkContro.displayMenu();
                    break;
            }
        }while (choose>=1 && choose<=2);
    }
}
