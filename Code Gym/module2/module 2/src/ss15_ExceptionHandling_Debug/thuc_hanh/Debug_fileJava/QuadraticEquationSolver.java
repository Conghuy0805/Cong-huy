package ss15_ExceptionHandling_Debug.thuc_hanh.Debug_fileJava;

import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập các hệ số của phương trình ax^2 + bx + c = 0: ");
        System.out.print("Nhập hệ số a: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập hệ số b: ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập hệ số c: ");
        double c = Double.parseDouble(sc.nextLine());

        try {
            double[] arr = solveQuadraticEquation(a, b, c);
            System.out.println("Nghiệm của phương trình là: ");
            System.out.print("x1 = " + arr[0]);
            System.out.print("\n" + "x2 = " + arr[1]);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double[] solveQuadraticEquation(double a, double b, double c) throws IllegalArgumentException {
        double[] arr = new double[2];
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            throw new IllegalArgumentException("Phương trình vô nghiệm! ");
        } else if (delta == 0) {
            arr[0] = (-b / (2 * a));
            arr[1] = arr[0];
        } else {
            arr[0] = ((-b + Math.sqrt(delta)) / (2 * a));
            arr[1] = ((-b - Math.sqrt(delta)) / (2 * a));
        }
        return arr;
    }
    // 1. Khi ta THROW thì ta phải ném THROWS ở trên khai báo tên phương thức để hàm gọi nó try-catch
    // 2. Khi ta đã bắt ngoại lệ tại đó thì hàm dùng nó chỉ cần gọi tên phương thức
}
