package ss13_Thuat_toan_tim_kiem.thuc_hanh.NhiPhan_KhongSd_DeQuy;

import static ss13_Thuat_toan_tim_kiem.thuc_hanh.NhiPhan_KhongSd_DeQuy.BinarySearch.binarySearch;
import static ss13_Thuat_toan_tim_kiem.thuc_hanh.NhiPhan_KhongSd_DeQuy.BinarySearch.list;

public class Main {
    public static void main(String[] args) {
        System.out.println(binarySearch(list, 2));  /* 0 */
        System.out.println(binarySearch(list, 11)); /* 4 */
        System.out.println(binarySearch(list, 79)); /*12 */
        System.out.println(binarySearch(list, 1));  /*-1 */
        System.out.println(binarySearch(list, 5));  /*-1 */
        System.out.println(binarySearch(list, 80)); /*-1 */
    }
}
