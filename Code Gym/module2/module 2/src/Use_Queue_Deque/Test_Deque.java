package Use_Queue_Deque;

import java.util.ArrayDeque;
import java.util.Deque;


public class Test_Deque {
    public static void main(String[] args) {
        Deque<String> danhSachSV = new ArrayDeque<>();

        danhSachSV.offer("Phạm Công Huy");
        danhSachSV.offer("Nguyễn Văn Phúc");
        danhSachSV.offer("Đặng Hải Phú Nguyên");
        danhSachSV.offerFirst("Bùi Ngọc Hoàng");
        danhSachSV.offerLast("Nguyễn Văn Kiên");
        while (true) {
            String ten = danhSachSV.poll(); // => lấy ra và xóa
            if (ten == null) {
                break;
            }
            // peek => lấy ra nhưng không xóa
            System.out.println(ten);
        }
    }
}
