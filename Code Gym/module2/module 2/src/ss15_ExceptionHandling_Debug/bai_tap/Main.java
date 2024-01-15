package ss15_ExceptionHandling_Debug.bai_tap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập cạnh thứ nhất: ");
            double a = Double.parseDouble(sc.nextLine());
            System.out.print("Nhập cạnh thứ hai: ");
            double b = Double.parseDouble(sc.nextLine());
            System.out.print("Nhập cạnh thứ ba: ");
            double c = Double.parseDouble(sc.nextLine());
            checkTriangle(a, b, c);
        } catch (IllegalTriangleException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    public static void checkTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Cạnh của tam giác không thể là âm hoặc bằng 0! ");
        }
        if (a + b < c || a + c < b || b + c < a) {
            throw new IllegalTriangleException("Không thể tạo thành tam giác nếu tổng hai cạnh không bằng cạnh còn lại! ");
        }
    }

}
