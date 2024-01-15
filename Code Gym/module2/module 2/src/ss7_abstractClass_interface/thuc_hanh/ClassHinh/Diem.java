package ss7_abstractClass_interface.thuc_hanh.ClassHinh;

public class Diem extends Hinh {
    public Diem(ToaDo toaDo) {
        super(toaDo);
    }

    @Override
    public double tinhDienTich() {
        return 1;
    }
}
