package ss7_abstractClass_interface.thuc_hanh.ClassHinh;

public class HinhChuNhat extends Hinh {
    private double chieuRong;
    private double chieuCao;

    public HinhChuNhat(ToaDo toaDo, double chieuRong, double chieuCao) {
        super(toaDo);
        this.chieuRong = chieuRong;
        this.chieuCao = chieuCao;
    }

    @Override
    public double tinhDienTich() {
        return this.chieuRong * this.chieuCao;
    }
}
