package ss15_ExceptionHandling_Debug.thuc_hanh.NumberFormatException;

import java.util.Scanner;

public class CalculationExample {
    public void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        } catch (ArithmeticException e) {
            System.out.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculationExample calculationExample = new CalculationExample();
        System.out.print("Nhập x: ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập y: ");
        int y = Integer.parseInt(sc.nextLine());
        calculationExample.calculate(x, y);
    }
}
