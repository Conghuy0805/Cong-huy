package ss14_Thuat_toan_sap_xep.thuc_hanh.BubbleSort.BubbleSort_thuat_toan;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử: ");
        int size = Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ [" + i + "]" + " : ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.print("\n" + "List bạn đã nhập là: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nBắt đầu xử lí sắp xếp...");
        bubbleSortByStep(arr);
    }

    public static void bubbleSortByStep(int[] arr) {
        boolean flag = true;
        for (int i = 1; i < arr.length && flag; i++) {
            flag = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false) {
                System.out.println("Mảng đã được sắp xếp hoàn chỉnh");
                break;
            }

            for (int k = 0; k < arr.length; k++) {
                System.out.println(arr[k] + " ");
            }
            System.out.println();
        }
    }
}
