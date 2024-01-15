package ss10_DSA_danh_sach.thuc_hanh.Demo_Arraylist;

import java.util.ArrayList;

public class Access_Update {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("Danh sách các phần tử: " + list);
        System.out.println();

        String first = list.get(0);
        System.out.println("Phần tử đầu tiên: " + first);

        String last = list.get(list.size() - 1);
        System.out.println("Phần tử cuối cùng: " + last);

        list.set(list.size() - 1, "Mango");
        System.out.println("Danh sách sau khi cập nhât: " + list);

        if (list.contains("Banana")) {
            list.remove("Banana");
            System.out.println("Đã xóa phần tử 'Banana' khỏi danh sách");
        } else {
            System.out.println("Phần tử 'Banana' không tồn tại trong danh sách");
        }
        System.out.println("Danh sách sau khi xóa: " + list);
    }
}
