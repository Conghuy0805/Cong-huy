package ss12_Collection_Framework.bai_tap.Use_ArrayList_LinkedList.Controller;

import ss12_Collection_Framework.bai_tap.Use_ArrayList_LinkedList.Service.ProductService;
import ss12_Collection_Framework.bai_tap.Use_ArrayList_LinkedList.Service.IProductService;

import java.util.Scanner;

public class ProductManager {
    private IProductService iProductService = new ProductService();

    public void display() {
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("========== Menu ==========");
            System.out.println("1. Tạo sản phẩm");
            System.out.println("2. Xem danh sách sản phẩm");
            System.out.println("3. Sửa thông tin sản phầm theo id");
            System.out.println("4. Xóa sản phẩm theo id");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm tăng dần theo giá");
            System.out.println("7. Sắp xếp sản phẩm giảm dần theo giá");
            System.out.println("Mời chọn chức năng");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iProductService.add();
                case 2:
                    iProductService.display();
                case 3:
                    iProductService.editID();
                case 4:
                    iProductService.removeId();
                case 5:
                    iProductService.searchName();
                case 6:
                    iProductService.sortUp();
                case 7:
                    iProductService.sortDowm();
            }
        } while (choose >= 1 && choose <= 7);
    }
}
