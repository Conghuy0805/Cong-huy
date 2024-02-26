package Thi.model;

public class SanPhamXuatKhau extends SanPham{
    private String giaXuatKhau;
    private String quocGiaNhapSP;

    public SanPhamXuatKhau(int id, String maSanPham, String tenSanPham, double giaBan, int soLuong, String nhaSanXuat, String giaXuatKhau, String quocGiaNhapSP) {
        super(id, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat);
        this.giaXuatKhau = giaXuatKhau;
        this.quocGiaNhapSP = quocGiaNhapSP;
    }

    public String getGiaXuatKhau() {
        return giaXuatKhau;
    }

    public void setGiaXuatKhau(String giaXuatKhau) {
        this.giaXuatKhau = giaXuatKhau;
    }

    public String getQuocGiaNhapSP() {
        return quocGiaNhapSP;
    }

    public void setQuocGiaNhapSP(String quocGiaNhapSP) {
        this.quocGiaNhapSP = quocGiaNhapSP;
    }

    @Override
    public String toString() {
        return "SanPhamXuatKhau{" +
                "id=" + getId() +
                ", maSanPham='" + getMaSanPham() + '\'' +
                ", tenSanPham='" + getTenSanPham() + '\'' +
                ", giaBan=" + getGiaBan() +
                ", soLuong=" + getSoLuong() +
                ", nhaSanXuat='" + getNhaSanXuat() + '\'' +
                ", giaXuatKhau='" + giaXuatKhau + '\'' +
                ", quocGiaNhapSP='" + quocGiaNhapSP + '\'' +
                '}';
    }

    @Override
    public String toSanPham() {
        return toString();
    }

}
