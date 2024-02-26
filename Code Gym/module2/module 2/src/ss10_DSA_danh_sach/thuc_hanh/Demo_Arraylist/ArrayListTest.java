package ss10_DSA_danh_sach.thuc_hanh.Demo_Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> studentName = new ArrayList<>();
        System.out.println("Nhập tên sinh viên (nhập 'done' để kết thúc): ");

        String name = sc.nextLine();
        while (!name.equalsIgnoreCase("done")) {
            if (!name.equals("Nguyên")) {
                studentName.add(name);
            } else {
                System.out.println("Nguyên không được thêm vào danh sách! ");
            }
            name = sc.nextLine();
        }

        System.out.println("Danh sách tên sinh viên: ");
        for (String student : studentName) {
            System.out.println(student);
        }

    }
}
