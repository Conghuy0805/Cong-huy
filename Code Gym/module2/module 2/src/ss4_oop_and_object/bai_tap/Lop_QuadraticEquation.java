package ss4_oop_and_object.bai_tap;

import java.util.Scanner;

public class Lop_QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá trị a: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập giá trị b: ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập giá trị c: ");
        double c = Double.parseDouble(sc.nextLine());
        QuadraticEquation pt = new QuadraticEquation(a, b, c);
        if (pt.getDiscriminant() > 0) {
            System.out.print("Phương trình có 2 nghiệm phân biệt: " + pt.getRoot1() + " and " + pt.getRoot2());
        } else if (pt.getDiscriminant() == 0) {
            System.out.print("Phương trình có nghiệm kép là: " + pt.getRoot1());
        } else {
            System.out.print("The equation has no roots");
        }
    }
}

class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return (Math.pow(b, 2) - 4 * a * c);
    }

    public double getRoot1() {
        if (this.getDiscriminant() > 0) {
            return ((-b + Math.sqrt(this.getDiscriminant())) / 2 * a);
        } else if (this.getDiscriminant() == 0) {
            return (-b / (2 * a));
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        if (this.getDiscriminant() > 0) {
            return ((-b - Math.sqrt(this.getDiscriminant())) / 2 * a);
        } else {
            return 0;
        }
    }
}
