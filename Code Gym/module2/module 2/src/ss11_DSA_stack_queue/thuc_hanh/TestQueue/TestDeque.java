package ss11_DSA_stack_queue.thuc_hanh.TestQueue;

import java.util.ArrayDeque;
import java.util.Deque;


public class TestDeque {
    public static void main(String[] args) {
        Deque<String> danhsachSV = new ArrayDeque<>();

        danhsachSV.offer("Huy");
        danhsachSV.offer("Phúc");
        danhsachSV.offer("Nguyên");
        danhsachSV.offer("Kiên");
        danhsachSV.offerFirst("Hoàng");
        danhsachSV.offerLast("Tuấn");
        

        while (true) {
            String ten = danhsachSV.poll(); // lấy ra và xóa
            if (ten == null) {
                break;
            }
            // peek: lấy ra nhưng không xóa
            System.out.println(ten);
        }
    }
}
