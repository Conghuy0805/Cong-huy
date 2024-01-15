package Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Kiểu nguyên thủy
        int[] arr1 = {1, 2, 3};

        // Copy mảng cách 1
        int[] arr_1 = arr1;
        arr_1[0] = 100;
        System.out.println("Mảng arr1: " + Arrays.toString(arr_1));
        System.out.println("Mảng arr_1: " + Arrays.toString(arr_1));
        System.out.println();

        // Copy mảng cách 2 - dùng hàm clone
        int[] arr_2 = arr1.clone();
        arr_2[0] = 50;
        System.out.println("Mảng arr_2: " + Arrays.toString(arr_2));
        System.out.println();

        // Copy mảng cách 2 - dùng hàm System.arraycopy
        int[] arr_3 = new int[arr1.length];
        System.arraycopy(arr1, 0, arr_3, 0, arr1.length);
        arr_3[0] = 80;
        System.out.println("Mảng arr_3: " + Arrays.toString(arr_3));
        System.out.println();

        // Kiểu đối tượng
        String[] arrObj1 = {"Huy", "Phúc"};

        // Copy mảng cách 1
        String[] arrObj_1 = arrObj1;
        arrObj_1[0] = "Nguyên";
        System.out.println("Mảng arrObj1: " + Arrays.toString(arrObj1));
        System.out.println("Mảng arrObj_1: " + Arrays.toString(arrObj_1));
        System.out.println();

        // Copy mảng cách 2 => dùng hàm clone
        String[] arrObj_2 = arrObj1.clone();
        arrObj_2[0] = "Hoàng";
        System.out.println("Mảng arrObj_2: " + Arrays.toString(arrObj_2));
        System.out.println();

        // Copy mảng cách 3 => dùng hàm System.arraycopy
        String[] arrObj_3 = new String[arrObj1.length];
        System.arraycopy(arrObj1, 0, arrObj_3, 0, arrObj1.length);
        arrObj_3[0] = "Huy";
        System.out.println("Mảng arrObj_3: " + Arrays.toString(arrObj_3));


    }
}
