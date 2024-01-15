package Search_Sort_Copy;

import java.util.Arrays;

public class Main {
    public static int[] reVerse(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
//        for (int i = 0; i < arr.length / 2; i++) {
//            if (arr[i] < arr[arr.length - 1 - i]) {
//                int temp = arr[i];
//                arr[i] = arr[arr.length - 1 - i];
//                arr[arr.length - 1 - i] = temp;
//            }
//        }
//        return arr;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 8, 2, 6, 4, 3, 5, 7, 9};
        int[] b = new int[5];
        System.out.println("Mảng a ban đầu: " + Arrays.toString(a));

        // Hàm sắp xếp tăng dần
        Arrays.sort(a);
        System.out.println("Mảng a sau khi sắp xếp: " + Arrays.toString(a));
        System.out.println();

        // Hàm tìm kiếm
        System.out.println(Arrays.binarySearch(a, 4));
        System.out.println(Arrays.binarySearch(a, -1));
        System.out.println();

        // Hàm điền giá trị
        Arrays.fill(b, 5);
        System.out.println("Mảng b sau khi điền giá trị: " + Arrays.toString(b));
        System.out.println();

        // Hàm sắp xếp giảm dần
        int[] a_1 = reVerse(a);
        System.out.println("Mảng a sau khi sắp xếp giảm dần: " + Arrays.toString(a_1));

    }
}
