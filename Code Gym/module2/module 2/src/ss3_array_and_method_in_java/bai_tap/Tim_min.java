package ss3_array_and_method_in_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Tim_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước của mảng: ");
        int size = Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];
        int index = 0;
        do {
            System.out.print("Nhập phần tử thứ [" + index + "]" + " : ");
            int value = Integer.parseInt(sc.nextLine());
            arr[index] = value;
            index++;
        } while (index < size);
        System.out.println("Mảng: ");
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.print("Giá trị nhỏ nhất trong mảng là: " + min);
    }
}
