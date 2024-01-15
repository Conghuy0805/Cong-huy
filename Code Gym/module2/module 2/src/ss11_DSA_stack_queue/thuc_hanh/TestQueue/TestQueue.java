package ss11_DSA_stack_queue.thuc_hanh.TestQueue;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue<String> danhsachSV = new LinkedList<>();

        danhsachSV.offer("Huy");
        danhsachSV.offer("Phúc");
        danhsachSV.offer("Nguyên");
        danhsachSV.offer("Kiên");

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
