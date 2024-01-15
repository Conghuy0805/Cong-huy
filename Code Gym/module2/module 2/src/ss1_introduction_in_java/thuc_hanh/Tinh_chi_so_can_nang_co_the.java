package ss1_introduction_in_java.thuc_hanh;

import java.util.Scanner;

public class Tinh_chi_so_can_nang_co_the {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Nhập chiều cao: ");
        height = sc.nextDouble();
        System.out.println("Nhập cân nặng: ");
        weight = sc.nextDouble();
        bmi = weight / Math.pow(height, 2);
        if (bmi < 18.5) {
            System.out.println("Chỉ số bmi = " + bmi + " - " + "Underweight");
        } else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.println("Chỉ số bmi = " + bmi + " - " + "Norman");
        } else if (bmi >= 25.0 && bmi < 30.0) {
            System.out.println("Chỉ số bmi = " + bmi + " - " + "Overweight");
        } else if (bmi >= 30.0) {
            System.out.println("Chỉ số bmi = " + bmi + " - " + "Obese");
        }
    }
}
