package ss14_Thuat_toan_sap_xep.bai_tap.Insertion_setting;

import java.util.Scanner;

public class InsertionByStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử: ");
        int size = Integer.parseInt(sc.nextLine());
        int[] list = new int[size];

        for (int i = 0; i < list.length; i++) {
            System.out.print("Nhập phần tử thứ [" + i + "]" + " : ");
            list[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.print("\n" + "List ban đầu là: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.print("\n" + "List sau khi sắp xếp: ");
        insertionSort(list);
        for (int num : list) {
            System.out.print(num + " ");
        }
    }

    public static void insertionSort(int[] list) {
        int pos, x;
        for (int i = 1; i < list.length; i++) {
            x = list[i];
            pos = i;
            while (pos > 0 && x < list[pos - 1]) {
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = x;
        }
    }
}
