package ss7_abstractClass_interface.thuc_hanh.ClassPhuongTien;

public class MayBay extends PhuongTienDiChuyen {
    private String loaiNhienLieu;

    public MayBay(HangSanXuat hangSanXuat, String loaiNhienLieu) {
        super("Máy bay", hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVanToc() {
        return 500;
    }

    public void catCanh() {
        System.out.println("Cất cánh");
    }

    public void haCanh() {
        System.out.println("Hạ cánh");
    }
}
