package ss12_Collection_Framework.bai_tap.Use_ArrayList_LinkedList.Repository;

import ss12_Collection_Framework.bai_tap.Use_ArrayList_LinkedList.Model.Product;

import java.util.ArrayList;

public interface IProductRepository {
    ArrayList<Product> findAll();

    void sortUp();

    void sortDown();
}
