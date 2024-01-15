package ss3_array_and_method_in_java.bai_tap;

import java.util.Scanner;

public class Tong_cua_mot_cot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] arr = {
                {1.0, 2.0, 3.0},
                {4.0, 5.4, 6.0},
                {7.0, 8.0, 1.2}
        };
        System.out.print("Nhập cột muốn tính tổng: ");
        int column = Integer.parseInt(scanner.nextLine());
        double total = sumColumn(arr, column);
        System.out.print("Tổng của cột " + column + " bằng: " + total);
    }

    public static double sumColumn(double[][] arr, int column) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == column) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
}

