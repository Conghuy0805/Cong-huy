package Use_Queue_Deque;

import java.util.LinkedList;
import java.util.Queue;

public class Test_Queue {
    public static void main(String[] args) {
        Queue<String> danhSachSV = new LinkedList<>();

        danhSachSV.offer("Phạm Công Huy");
        danhSachSV.offer("Nguyễn Văn Phúc");
        danhSachSV.offer("Đặng Hải Phú Nguyên");

        while (true) {
            String ten = danhSachSV.poll(); // poll => lấy ra và xóa
            if (ten == null) {
                break;
            }
            // peek => lấy ra nhưng không xóa
            System.out.println(ten);
        }
    }
}
