package ss3_array_and_method_in_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Xoa_phan_tu_khoi_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        int cnt = 0;
        int count = 0;
        System.out.print("Nhập phần tử cần xóa: ");
        int x = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.print("X ở vị trí thứ " + (i + 1) + "\n");
                cnt++;
                break;
            }
        }
        for (int j = 1; j <= cnt; j++) {
            for (int k = 0; k < arr.length; k++) {
                if (k == (arr.length - 1)) {
                    arr[k] = 0;
                    break;
                }
                if (arr[k] == x) {
                    int temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.print("X không tồn tại trong mảng");
        }
        System.out.print(Arrays.toString(arr));
    }
}