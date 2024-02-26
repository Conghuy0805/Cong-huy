package String_Handling.String_Conver;

public class Main {
    public static void main(String[] args) {
        String s1 = "CoNg.";
        String s2 = "HuY";

        String s3 = s1 + s2;

        // Hàm concat => nối chuỗi
        String s4 = s1.concat(s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
        System.out.println();

        // Hàm replace => thay thế
        String s5 = "Huy";
        String s6 = s5.replaceAll("Huy", "Thương");
        System.out.println("s6 = " + s6);
        System.out.println();

        // Hàm toLowerCase => hàm chuyển về viết thường
        // Hàm toUpperCase => hàm chuyển về viết hoa
        String s7 = s3.toLowerCase();
        String s8 = s3.toUpperCase();
        System.out.println("s7 = " + s7);
        System.out.println("s8 = " + s8);
        System.out.println();

        // Hàm trim() => xóa khoảng trắng dư thừa ở đầu chuỗi
        String s9 = " Xin chào mình tên là Phạm Công Huy      ";
        System.out.println(s9.trim());
        System.out.println();

        // Hàm substring => cắt chuỗi con
        String s10 = "Xin chào mình tên là Phạm Công Huy";
        String s11 = s10.substring(21);
        String s12 = s10.substring(21, 31);
        System.out.println("s11 = " + s11);
        System.out.println("s12 = " + s12);

    }
}
