package ss3_array_and_method_in_java.bai_tap;

import java.util.Scanner;

public class Tinh_tong_duong_cheo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước của ma trận: ");
        int size = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Giá trị của phần tử [" + i + "]" + "[" + j + "]" + " : ");
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("Ma trận vừa nhập: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.print("Tổng đường chéo chính của ma trận vuông = " + sum);
    }
}

