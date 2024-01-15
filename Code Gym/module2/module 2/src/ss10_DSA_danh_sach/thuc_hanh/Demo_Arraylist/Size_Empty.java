package ss10_DSA_danh_sach.thuc_hanh.Demo_Arraylist;

import java.util.ArrayList;

public class Size_Empty {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("Danh sách các phần tử: " + list);
        System.out.println();

        System.out.println("Kích thước của danh sách: " + list.size());

        if (list.isEmpty()) {
            System.out.println("Danh sách rỗng");
        } else {
            System.out.println("Danh sách không rỗng");
        }

        list.clear();
        System.out.println("Danh sách các phần tử: " + list);
        System.out.println();

        System.out.println("Kích thước của danh sách: " + list.size());

        if (list.isEmpty()) {
            System.out.println("Danh sách rỗng");
        } else {
            System.out.println("Danh sách không rỗng");
        }

    }
}
