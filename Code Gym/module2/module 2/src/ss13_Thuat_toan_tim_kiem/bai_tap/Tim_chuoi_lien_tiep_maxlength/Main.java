package ss13_Thuat_toan_tim_kiem.bai_tap.Tim_chuoi_lien_tiep_maxlength;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();
        LinkedList<Character> max = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (list.size() > 1 && str.charAt(i) <= list.getLast() && list.contains(str.charAt(i))) {
                list.clear();
            }
            list.add(str.charAt(i));
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }

        }
        for (Character ch : max) {
            System.out.print(ch);
        }
    }
}
