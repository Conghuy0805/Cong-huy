package Thi2.controller;


import Thi2.Exeption.NotFoundProductException;
import Thi2.model.PhoneXachTay;

import java.util.Scanner;

public class PhoneContro {
    static Scanner sc = new Scanner(System.in);

    public void menu() throws NotFoundProductException {
        int choose;
        do {
            System.out.println("Menu:");
            System.out.println("1. Điện thoại xách tay. ");
            System.out.println("2. Điện thoại chính hãng.");
            System.out.println("3. Exit.");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    PhoneXTContro phoneXTContro = new PhoneXTContro();
                    phoneXTContro.displayMenu();
                    break;
                case 2:
                    PhoneCHContro phoneCHContro = new PhoneCHContro();
                    phoneCHContro.displayMenu();
                    break;
            }
        } while (choose >= 1 && choose <= 2);
    }
}
