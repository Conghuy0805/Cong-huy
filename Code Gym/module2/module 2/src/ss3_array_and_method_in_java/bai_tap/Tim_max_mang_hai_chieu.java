package ss3_array_and_method_in_java.bai_tap;

import java.util.Scanner;

public class Tim_max_mang_hai_chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số cột của ma trận: ");
        int columns = Integer.parseInt(sc.nextLine());
        System.out.println();
        double[][] arr = new double[rows][columns];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Nhập giá trị phần tử [" + i + "]" + "[" + j + "]" + " : ");
                arr[i][j] = Double.parseDouble(sc.nextLine());
            }
            System.out.println();
        }
        System.out.println("Giá trị lớn nhất của mảng 2 chiều: " + maxArray(arr));
    }
    public static double maxArray(double[][] arr) {
        double max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
