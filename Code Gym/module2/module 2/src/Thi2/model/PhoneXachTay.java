package Thi2.model;

public class PhoneXachTay extends Phone {
    private String quocGiaXT;
    private String trangThai;

    public PhoneXachTay(int id, String tenPhone, String giaBan, String soLuong, String nhaSanXuat, String quocGiaXT, String trangThai) {
        super(id, tenPhone, giaBan, soLuong, nhaSanXuat);
        this.quocGiaXT = quocGiaXT;
        this.trangThai = trangThai;
    }

    public String getQuocGiaXT() {
        return quocGiaXT;
    }

    public void setQuocGiaXT(String quocGiaXT) {
        this.quocGiaXT = quocGiaXT;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "PhoneXachTay{" +
                "id=" + getId() +
                ", tenPhone='" + getTenPhone() + '\'' +
                ", giaBan='" + getGiaBan() + '\'' +
                ", soLuong='" + getSoLuong() + '\'' +
                ", nhaSanXuat='" + getNhaSanXuat() + '\'' +
                "quocGiaXT='" + quocGiaXT + '\'' +
                ", trangThai='" + trangThai + '\'' +
                '}';
    }

    @Override
    public String toPhone() {
        return toString();
    }
}
