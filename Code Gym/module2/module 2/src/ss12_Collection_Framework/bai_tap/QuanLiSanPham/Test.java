package ss12_Collection_Framework.bai_tap.QuanLiSanPham;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManager pr = new ProductManager();
        int choose = 0;
        do {
            System.out.println("-------MENU-------");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm theo id: ");
            System.out.println("3. Xóa sản phẩm theo id: ");
            System.out.println("4. Hiển thị danh sách sản phẩm: ");
            System.out.println("5. Tìm kiếm sản phẩm theo tên: ");
            System.out.println("6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
            System.out.println("7. Thoát chương trình!!! ");
            System.out.println("-------------------");
            choose = sc.nextInt();
            sc.nextLine();

            switch (choose) {
                case 1:
                    System.out.println("Nhập id sản phẩm: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập tên sản phẩm: ");
                    String ten = sc.nextLine();
                    System.out.println("Nhập giá sản phẩm: ");
                    double gia = Float.parseFloat(sc.nextLine());
                    Product product = new Product(id, ten, gia);
                    pr.addList(product);
                    break;
                case 2:
                    System.out.println("Nhập id muốn sửa: ");
                    int idEdit = Integer.parseInt(sc.nextLine());
                    pr.editList(idEdit);
                    break;
                case 3:
                    System.out.println("Nhập id cần xóa: ");
                    int idDelete = Integer.parseInt(sc.nextLine());
                    pr.deleteList(idDelete);
                    break;
                case 4:
                    System.out.println("Danh sách sản phẩm: ");
                    pr.showlist();
                    break;
                case 5:
                    System.out.println("Nhập tên sản phẩm muốn tìm: ");
                    String tenSanPham = sc.nextLine();
                    pr.searchList(tenSanPham);
                    break;
                case 6:
                    System.out.println("1. Sắp xếp tăng: ");
                    System.out.println("2. Sắp xếp giảm: ");
                    int up_down = Integer.parseInt(sc.nextLine());
                    if (up_down == 1) {
                        pr.sortUp();
                        pr.showlist();
                    } else {
                        pr.sortDown();
                        pr.showlist();
                    }
                    break;
                default:
                    System.out.println("Thoát chương trình! ");
                    System.exit(0);
            }
        } while (choose != 7);

    }
}
