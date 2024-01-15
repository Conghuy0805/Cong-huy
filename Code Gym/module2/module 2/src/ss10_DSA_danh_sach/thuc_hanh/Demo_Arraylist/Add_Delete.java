package ss10_DSA_danh_sach.thuc_hanh.Demo_Arraylist;

import java.util.ArrayList;

public class Add_Delete {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        System.out.println("Danh sách sau khi thêm 'Apple': " + list);
        list.add("Banana");
        System.out.println("Danh sách sau khi thêm 'Banana': " + list);
        list.add("Orange");
        System.out.println("Danh sách sau khi thêm 'Orange': " + list);
        System.out.println();

        list.remove(1);
        System.out.println("Danh sách sau khi xóa 'Banana': " + list);

    }
}
