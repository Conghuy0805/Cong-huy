package Use_Set;

import java.util.*;

public class RutThamTrungThuong_TreeSet {
    Set<String> thungPhieuDuThuong;

    public RutThamTrungThuong_TreeSet() {
        this.thungPhieuDuThuong = new TreeSet<>();
    }

    public boolean themPhieu(String giaTri) {
        return this.thungPhieuDuThuong.add(giaTri);
    }

    public boolean xoaPhieu(String giaTri) {
        return this.thungPhieuDuThuong.remove(giaTri);
    }

    public boolean kiemTraPhieuTonTai(String giaTri) {
        return this.thungPhieuDuThuong.contains(giaTri);
    }

    public void xoaTatCa() {
        this.thungPhieuDuThuong.clear();
    }

    public int soLuong() {
        return this.thungPhieuDuThuong.size();
    }

    public String rutTham() {
        String kq = "";
        Random random = new Random();
        int viTri = random.nextInt(this.thungPhieuDuThuong.size());
        kq = (String) this.thungPhieuDuThuong.toArray()[viTri];
        return kq;
    }

    public void inTatCa() {
        System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RutThamTrungThuong_TreeSet rt = new RutThamTrungThuong_TreeSet();
        int choose = 0;
        do {
            System.out.println("@========================MENU========================@");
            System.out.println("|1. Thêm mã số dự thưởng.                            |");
            System.out.println("|2. Xóa mã số dự thưởng.                             |");
            System.out.println("|3. Kiểm tra mã số dự thưởng có tồn tại hay không?   |");
            System.out.println("|4. Xóa tất các các phiếu dự thưởng.                 |");
            System.out.println("|5. Số lượng phiếu dự thưởng.                        |");
            System.out.println("|6. Rút thăm trúng thưởng.                           |");
            System.out.println("|7. In ra tất cả các phiếu.                          |");
            System.out.println("|0. Thoát khỏi chương trình!                         |");
            System.out.println("@====================================================@");
            System.out.println("--> Nhập lựa chọn của bạn:");
            choose = Integer.parseInt(sc.nextLine());

            switch (choose) {
                case 1:
                    System.out.println("Nhập vào mã phiếu muốn thêm: ");
                    String giaTri1 = sc.nextLine();
                    rt.thungPhieuDuThuong.add(giaTri1);
                    break;
                case 2:
                    System.out.println("Nhập vào mã phiếu muốn xóa: ");
                    String giaTri2 = sc.nextLine();
                    rt.xoaPhieu(giaTri2);
                    break;
                case 3:
                    System.out.println("Nhập vào mã phiếu muốn kiểm tra tồn tại hay không?");
                    String giaTri3 = sc.nextLine();
                    System.out.println(rt.kiemTraPhieuTonTai(giaTri3));
                    break;
                case 4:
                    rt.xoaTatCa();
                    break;
                case 5:
                    System.out.println("Số lượng phiếu dự thưởng là: " + rt.soLuong());
                    break;
                case 6:
                    System.out.println("Mã số trúng thưởng là: " + rt.rutTham());
                    break;
                case 7:
                    System.out.println("Các mã phiếu dự thưởng là: ");
                    rt.inTatCa();
                    break;
                default:
                    System.exit(0);
            }
        } while (choose != 0);
    }
}
