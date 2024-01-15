package Thi2.model;

public class PhoneChinhHang extends Phone {
    private String timeBaoHanh;
    private String phamViBH;

    public PhoneChinhHang(int id, String tenPhone, String giaBan, String soLuong, String nhaSanXuat, String timeBaoHanh, String phamViBH) {
        super(id, tenPhone, giaBan, soLuong, nhaSanXuat);
        this.timeBaoHanh = timeBaoHanh;
        this.phamViBH = phamViBH;
    }

    public String getTimeBaoHanh() {
        return timeBaoHanh;
    }

    public void setTimeBaoHanh(String timeBaoHanh) {
        this.timeBaoHanh = timeBaoHanh;
    }

    public String getPhamViBH() {
        return phamViBH;
    }

    public void setPhamViBH(String phamViBH) {
        this.phamViBH = phamViBH;
    }

    @Override
    public String toString() {
        return "PhoneChinhHang{" +
                "id=" + getId() +
                ", tenPhone='" + getTenPhone() + '\'' +
                ", giaBan='" + getGiaBan() + '\'' +
                ", soLuong='" + getSoLuong() + '\'' +
                ", nhaSanXuat='" + getNhaSanXuat() + '\'' +
                "timeBaoHanh='" + timeBaoHanh + '\'' +
                ", phamViBH='" + phamViBH + '\'' +
                '}';
    }

    @Override
    public String toPhone() {
        return toString();
    }
}
