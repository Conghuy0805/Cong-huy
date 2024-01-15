package ss19_String_Regex.bai_tap.Validate_NameClass;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên lớp học: ");
        String nameClass = sc.nextLine();
        String regex = "^[CAP][\\d]{4}[GHIKLM]$";
        if (Pattern.matches(regex, nameClass)) {
            System.out.println(nameClass + " là tên hợp lệ");
        } else {
            System.out.println(nameClass + " tên không hợp lệ");
        }
    }
}
