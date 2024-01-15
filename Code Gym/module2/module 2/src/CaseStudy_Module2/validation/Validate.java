package CaseStudy_Module2.validation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    static Scanner sc = new Scanner(System.in);

    public static String email() {
        while (true) {
            System.out.println("Nhập email: ");
            String email = sc.nextLine();
            String regex = "^[\\w.]+@[\\w&&[^_]]+([.][\\w&&[^_]]+){1,2}$";
            if (Pattern.matches(regex, email)) {
                return email;
            } else {
                System.out.println("Sai định dạng!!! Hãy nhập lại");
            }
        }
    }

    public static String hoVaTen() {
        while (true) {
            System.out.println("Nhập họ và tên: ");
            String hoVaTen = sc.nextLine();
            String regex = "^[\\p{L} ]+$";
            if (Pattern.matches(regex, hoVaTen)) {
                return hoVaTen;
            } else {
                System.out.println("Sai định dạng!!! Hãy nhập lại");
            }
        }
    }
}
