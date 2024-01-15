package Thi2.view;


import Thi2.Exeption.NotFoundProductException;
import Thi2.controller.PhoneContro;

public class Main {
    public static void main(String[] args) throws NotFoundProductException {
        PhoneContro phoneContro = new PhoneContro();
        phoneContro.menu();
    }
}
