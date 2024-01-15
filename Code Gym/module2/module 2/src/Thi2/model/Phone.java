package Thi2.model;

public abstract class Phone {
    private int id;
    private String tenPhone;
    private String giaBan;
    private String soLuong;
    private String nhaSanXuat;

    public Phone(int id, String tenPhone, String giaBan, String soLuong, String nhaSanXuat) {
        this.id = id;
        this.tenPhone = tenPhone;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenPhone() {
        return tenPhone;
    }

    public void setTenPhone(String tenPhone) {
        this.tenPhone = tenPhone;
    }

    public String getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(String giaBan) {
        this.giaBan = giaBan;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", tenPhone='" + tenPhone + '\'' +
                ", giaBan='" + giaBan + '\'' +
                ", soLuong='" + soLuong + '\'' +
                ", nhaSanXuat='" + nhaSanXuat + '\'' +
                '}';
    }

    public abstract String toPhone();
}
