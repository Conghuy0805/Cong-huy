package ss10_DSA_danh_sach.bai_tap.ArrayList;

public class Main {

    public static void main(String[] args) {
        MyList<Integer> arrlist = new MyList<>();
        arrlist.add(1);
        arrlist.add(2);
        arrlist.add(3);
        arrlist.add(4);
        arrlist.add(1, 5);
        arrlist.add(4, 10);
//        arrlist.remove(0);
        arrlist.add(11);
        arrlist.clone();
        arrlist.get();
    }
}
