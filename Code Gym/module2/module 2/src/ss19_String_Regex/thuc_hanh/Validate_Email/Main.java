package ss19_String_Regex.thuc_hanh.Validate_Email;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String email = email();
        System.out.println(email + " là đúng định dạng");
    }

    private static String email() {
        while (true) {
            System.out.println("Nhập email: ");
            String email = scanner.nextLine();
            String regex = "^\\b[\\w\\.-]+@[\\w\\.-]+\\.\\w{2,4}\\b$";
//            String regex2 = "^09\\d{8}$";
            if (Pattern.matches(regex, email)) {
                return email;
            } else {
                System.out.println("Sai nhập lại! " + "\n");
            }
        }
    }
}
