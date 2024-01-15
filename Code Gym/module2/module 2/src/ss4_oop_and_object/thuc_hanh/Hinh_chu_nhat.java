package ss4_oop_and_object.thuc_hanh;


import java.util.Scanner;

public class Hinh_chu_nhat {
    private double width;
    private double height;

    public Hinh_chu_nhat() {
    }

    public Hinh_chu_nhat(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String display() {
        return "Hình chữ nhật có chiều dài là: " + height + "," + " chiều rộng là: " + width + "\n";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        double height = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập chiều rộng: ");
        double width = Double.parseDouble(sc.nextLine());
        Hinh_chu_nhat rectangle = new Hinh_chu_nhat(width, height);
        System.out.print(rectangle.display());
        System.out.println("Chu vi hình chữ nhật là: " + rectangle.getPerimeter());
        System.out.println("Diện tích hình chữ nhật là: " + rectangle.getArea());
    }
}
