package ss12_Collection_Framework.bai_tap.QuanLiSanPham;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {
    private ArrayList<Product> arrayList;
    Scanner sc = new Scanner(System.in);

    public ProductManager() {
        this.arrayList = new ArrayList<>();
    }

    public void addList(Product product) {
        this.arrayList.add(product);
    }

    public void editList(int index) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getId() == index) {
                System.out.println("Nhập lại tên sản phẩm muốn sửa: ");
                String tenMoi = sc.nextLine();

                System.out.println("Nhập lại giá sản phẩm: ");
                double giaMoi = Double.parseDouble(sc.nextLine());

                Product p = new Product(index, tenMoi, giaMoi);
                arrayList.set(i, p);
            }
        }
    }

    public void deleteList(int index) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getId() == index) {
                arrayList.remove(i);

            }
        }
    }

    public void showlist() {
        if (arrayList.isEmpty()) {
            System.out.println("Không có sản phẩm nào cả! ");
        } else {
            for (Product product : arrayList) {
                System.out.println(product);
            }
        }
    }

    public void searchList(String ten) {
        for (Product product : arrayList) {
            if (product.getName().equalsIgnoreCase(ten)) {
                System.out.println(product);
            }
        }
    }

    public void sortUp() {
        Collections.sort(this.arrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }

    public void sortDown() {
        Collections.sort(this.arrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return -1;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }

}
