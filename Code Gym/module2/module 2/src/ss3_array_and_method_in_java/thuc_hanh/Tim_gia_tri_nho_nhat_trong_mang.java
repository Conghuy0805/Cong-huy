package ss3_array_and_method_in_java.thuc_hanh;

public class Tim_gia_tri_nho_nhat_trong_mang {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int minvalue = minarr(arr);
        System.out.print("Giá trị nhỏ nhất trong mảng là: " + minvalue);
    }

    public static int minarr(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
