package String_Handling.Compare_String;

public class Main {
    public static void main(String[] args) {
        String s1 = "cong.huy";
        String s2 = "CONG.HUY";
        String s3 = "cong.huy";

        // Hàm equals => so sánh 2 chuỗi giống nhau
        System.out.println("s1 equals s2: " + s1.equals(s2));
        System.out.println("s1 equals s3: " + s1.equals(s3));
        System.out.println();

        // Hàm equalsIgnoreCase => so sánh 2 chuỗi giống nhau không phân biệt chữ hoa và chữ thường
        System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2));
        System.out.println("s1 equalsIgnoreCase s3: " + s1.equalsIgnoreCase(s3));
        System.out.println();

        // Hàm compareTo => so sánh > , < , =
        String sv1 = " Nguyễn Văn A";
        String sv2 = " Nguyễn Văn B";
        String sv3 = " Nguyễn Văn ";
        String sv4 = " Nguyễn Văn A";
        System.out.println("sv1 compareTo sv2: " + sv1.compareTo(sv2));
        System.out.println("sv1 compareTo sv3: " + sv1.compareTo(sv3));
        System.out.println("sv1 compareTo sv4: " + sv1.compareTo(sv4));
        System.out.println();

        // Hàm compareToIgnoreCase => tương tự compareTo, không phân biệt chữ hoa và chữ thường
        String sv_1 = "Nguyễn Văn A";
        String sv_2 = "Nguyễn Văn a";
        String sv_3 = "Nguyễn Văn B";
        String sv_4 = "Nguyễn Văn ";
        System.out.println("sv_1 compareToIgnoreCase sv_2: " + sv_1.compareToIgnoreCase(sv_2));
        System.out.println("sv_1 compareToIgnoreCase sv_3: " + sv_1.compareToIgnoreCase(sv_3));
        System.out.println("sv_1 compareToIgnoreCase sv_4: " + sv_1.compareToIgnoreCase(sv_4));
        System.out.println();

        // Hàm regionMatches => so sánh 1 đoạn
        String r1 = "Huy";
        String r2 = "CongHuy";
        boolean check1 = r1.regionMatches(1,r2,5,2);
        boolean check2 = r1.regionMatches(true,1,r2,5,2);
        System.out.println(check1);
        System.out.println(check2);
        System.out.println();

        // Hàm starWith => hàm kiểm tra chuỗi bắt đầu bằng ...
        String sdt = "0374545451";
        System.out.println(sdt.startsWith("037"));
        System.out.println(sdt.startsWith("034"));
        System.out.println();

        // Hàm enWith => hàm kiểm tra chuỗi kết thúc bằng ...
        String tenFile1 = "text.JPG";
        String tenFile2 = "text.PDF";
        if (tenFile1.endsWith(".JPG")){
            System.out.println("File 1 là hình ảnh! ");
        }else if (tenFile1.endsWith(".PDF")){
            System.out.println("File 1 là file PDF! ");
        }

        if (tenFile2.endsWith(".JPG")){
            System.out.println("File 2 là hình ảnh! ");
        }else if (tenFile2.endsWith(".PDF")){
            System.out.println("File 2 là file PDF! ");
        }
    }
}
