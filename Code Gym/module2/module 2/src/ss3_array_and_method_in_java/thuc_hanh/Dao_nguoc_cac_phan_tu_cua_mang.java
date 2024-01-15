package ss3_array_and_method_in_java.thuc_hanh;

import java.util.Scanner;

public class Dao_nguoc_cac_phan_tu_cua_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Nhập kích thước của mảng: ");
            size = Integer.parseInt(sc.nextLine());
            if (size > 20) {
                System.out.print("Kích thước không đươc quá 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập phần tử " + (i + 1) + ": ");
            array[i] = Integer.parseInt(sc.nextLine());
            i++;
        }
        System.out.print("Các phần tử trong mảng là: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.print("\n" + "Mảng khi được đảo ngược: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
