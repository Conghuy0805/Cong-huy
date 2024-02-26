package ss19_String_Regex.thuc_hanh.Validate_Account;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String account = account();
        System.out.println(account);
    }

    public static String account() {
        while (true) {
            System.out.println("Nhập: ");
            String account = scanner.nextLine();
            String regex = "^[_a-z0-9]{6,}$";// [hoặc] có thể chọn 1 trong chừng đó cái
            if (Pattern.matches(regex, account)) {
                return account;
            } else {
                System.out.println("Sai nhập lại! ");
            }
        }
    }
}
