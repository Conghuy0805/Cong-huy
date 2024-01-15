package ss12_Collection_Framework.thuc_hanh.Cay_nhi_phan;

public interface Tree<E> {
    boolean insert(E e);

    void inorder();

    int getSize();
}
