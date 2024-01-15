package ss19_String_Regex.bai_tap.Validate_NumberPhone;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phoneNumber = sc.nextLine();
        String regex = "^[(][\\d]{2}[)]-[(]0[\\d]{9}[)]$";
        if (Pattern.matches(regex, phoneNumber)) {
            System.out.println(phoneNumber + " là tên hợp lệ");
        } else {
            System.out.println(phoneNumber + " tên không hợp lệ");
        }
    }
}
