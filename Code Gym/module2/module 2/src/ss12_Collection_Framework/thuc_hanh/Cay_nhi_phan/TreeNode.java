package ss12_Collection_Framework.thuc_hanh.Cay_nhi_phan;

public class TreeNode<E> {
    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;

    protected TreeNode(E e){
        element = e;
    }
}
