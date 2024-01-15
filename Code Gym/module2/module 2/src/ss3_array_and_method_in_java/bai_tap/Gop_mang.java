package ss3_array_and_method_in_java.bai_tap;

import java.util.Arrays;

public class Gop_mang {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }
        System.out.println("Mảng sau khi gộp: ");
        System.out.println(Arrays.toString(arr3));
    }

}
