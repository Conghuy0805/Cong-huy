package ss12_Collection_Framework.bai_tap.Use_ArrayList_LinkedList.Service;

import ss12_Collection_Framework.bai_tap.Use_ArrayList_LinkedList.Model.Product;

import java.util.ArrayList;

public interface IProductService {
    void display();

    ArrayList<Product> add();

    ArrayList<Product> editId();

    ArrayList<Product> removeId();

    void searchName();

    void sortUp();

    void sortDown();

    void editID();

    void sortDowm();
}
