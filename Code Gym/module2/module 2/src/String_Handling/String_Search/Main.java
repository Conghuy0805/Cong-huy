package String_Handling.String_Search;

public class Main {
    public static void main(String[] args) {
        String s1 = "Xin chào cô chú, xin chào các bạn, Xin chào!";
        String s2 = "Xin chào";
        String s3 = "Xin chào 123";
        char c1 = 'ô';
        // Hàm indexOf
        System.out.println("Vị trí của s2 trong s1 là: " + s1.indexOf(s2));
        System.out.println("Vị trí của s3 trong s1 là: " + s1.indexOf(s3));
        System.out.println();

        // Sử dụng vị trí bắt đầu
        System.out.println("Vị trí của s2 trong s1 là: " + s1.indexOf(s2,2));
        System.out.println();

        // Tìm kiếm char
        System.out.println("Vị trí của c1 trong s1 là: " + s1.indexOf(c1));
        System.out.println("Vị trí của c1 trong s1 là: " + s1.indexOf(c1,11));
        System.out.println("Vị trí của c1 trong s1 là: " + s1.indexOf(c1,10));
        System.out.println();

        // Hàm lastIndeOf => tìm kiếm từ phải sang trái
        System.out.println("Vị trí của s2 trong s1 (từ phải sang trái) là: " + s1.lastIndexOf(s2));
    }
}
