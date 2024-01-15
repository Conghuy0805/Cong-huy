package Mini_Game.Game;


import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*
- Một người chơi sẽ có tài khoản. Người chơi có quyền đặt cược số tiền it hơn hoặc bawgf số tiền họ đang có
- Luật chơi như sau:
+ Có 3 viên xúc xắc. Mỗi viên xúc xắc có 6 mặt có giá trị từ 1 đến 6
+ Mỗi lần lắc sẽ ra một kết quả. Kết quản = giá trị xx1 + giá trị xx2 + giá trị xx3
+ 1. Nếu tổng = 3 hoặc 18 => Cái ăn hết, người chơi thua.
+ 2. Nếu tổng = (4 -> 10) <-> xỉu => nếu người chơi đặt xỉu thì người chơi thắng, ngược lại thua
+ 3. Nếu tổng = (11 -> 17) <-> tài => nếu người chơi đặt tài thì người chơi thắng, ngược lại thua
*/
public class TaiXiu {
    public static void main(String[] args) {
        double taiKhoanNguoiChoi = 5000000;
        Scanner scanner = new Scanner(System.in);

//        Locale lc = new Locale("vi", "VN");
        Locale lc = new Locale("en", "US");
//        NumberFormat numf = NumberFormat.getInstance(lc);
        NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
        int choose = 1;
        do {
            System.out.println("-------- MỜI BẠN LỰA CHỌN --------");
            System.out.println("1. Tiếp tục chơi");
            System.out.println("2. Thoát trò chơi");
            choose = Integer.parseInt(scanner.nextLine());
            if (choose == 1) {
                System.out.println("********** BẮT ĐẦU CHƠI **********");

                // Đặt cược
                System.out.println("****** Tài khoản của bạn: " + numf.format(taiKhoanNguoiChoi) + "   , bạn muốn cược bao nhiêu?");
                double datCuoc;
                do {
                    System.out.println("****** Đăt cược (0 < số tiền cược <= " + numf.format(taiKhoanNguoiChoi) + ")" + ":");
                    datCuoc = Double.parseDouble(scanner.nextLine());
                } while (datCuoc <= 0 || datCuoc > taiKhoanNguoiChoi);

                // Chọn tài xỉu
                int luaChonTaiXiu = 0;
                do {
                    System.out.println("****** Chọn 1 <-> Tài hoặc 2 <-> Xỉu");
                    luaChonTaiXiu = Integer.parseInt(scanner.nextLine());
                } while (luaChonTaiXiu != 1 && luaChonTaiXiu != 2);

                // Tung xúc xắc
                Random xucxac1 = new Random();
                Random xucxac2 = new Random();
                Random xucxac3 = new Random();

                int giaTri1 = xucxac1.nextInt(5) + 1;
                int giaTri2 = xucxac2.nextInt(5) + 1;
                int giaTri3 = xucxac3.nextInt(5) + 1;
                int tong = giaTri1 + giaTri2 + giaTri3;

                // Tính toán kết quả
                System.out.println("****** Kết quả: " + giaTri1 + " - " + giaTri2 + " - " + giaTri3);
                if (tong == 3 || tong == 18) {
                    taiKhoanNguoiChoi -= datCuoc;
                    System.out.println("****** Tổng là: " + tong + " => Nhà cái ăn hết, bạn đã thua");
                    System.out.println("****** Tài khoản của bạn là: " + numf.format(taiKhoanNguoiChoi));
                } else if (tong >= 4 || tong <= 10) {
                    System.out.println("****** Tổng là: " + tong + " => Xiu");
                    if (luaChonTaiXiu == 2) {
                        System.out.println("****** Bạn đã thắng cược ");
                        taiKhoanNguoiChoi += datCuoc;
                        System.out.println("****** Tài khoản của bạn là: " + numf.format(taiKhoanNguoiChoi));
                    } else {
                        System.out.println("****** Bạn đã thua cược ");
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("****** Tài khoản của bạn là: " + numf.format(taiKhoanNguoiChoi));
                    }
                } else {
                    System.out.println("****** Tổng là: " + tong + " => Tài");
                    if (luaChonTaiXiu == 1) {
                        System.out.println("****** Bạn đã thắng cược ");
                        taiKhoanNguoiChoi += datCuoc;
                        System.out.println("****** Tài khoản của bạn là: " + numf.format(taiKhoanNguoiChoi));
                    } else {
                        System.out.println("****** Bạn đã thua cược: ");
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("****** Tài khoản của bạn là: " + numf.format(taiKhoanNguoiChoi));
                    }
                }
            }
        } while (choose == 1);
    }
}
