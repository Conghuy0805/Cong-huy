package ss7_abstractClass_interface.thuc_hanh.ClassPhuongTien;

public class XeDap extends PhuongTienDiChuyen {
    public XeDap(HangSanXuat hangSanXuat) {
        super("Xe Đạp", hangSanXuat);
    }

    @Override
    public double layVanToc() {
        return 20;
    }
}
