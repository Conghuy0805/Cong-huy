package ss10_DSA_danh_sach.bai_tap.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> in = new MyLinkedList<>();
        in.addFirst("H");
        in.add("E");
        in.add("L");
        in.add("L");
        in.add("O");
        in.remove("H");
        in.remove("O");
        in.printList();
    }
}
