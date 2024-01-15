package ss13_Thuat_toan_tim_kiem.bai_tap.NhiPhan_sd_DeQuy;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử: ");
        int num = Integer.parseInt(sc.nextLine());
        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ [" + i + "]" + " : ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        Arrays.sort(arr);
        System.out.println("Mảng của bạn: " + Arrays.toString(arr));
        System.out.println("Vị trí của giá trị bạn cần tìm là: " + binarySearch(arr, 7));
    }

    public static int binarySearch(int[] array, int value) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int middle = (right + left) / 2;

            if (array[middle] == value) {
                return middle;
            } else if (value < array[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
