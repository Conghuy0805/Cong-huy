package QuanLiDienThoai.model;

public class PhoneManagement {
    private int id;
    private String ten;
    private double gia;
    private String nhaSanXuat;

    public PhoneManagement() {
    }

    public PhoneManagement(int id, String ten, double gia, String nhaSanXuat) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public String toString() {
        return "PhoneManagement{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                ", gia=" + gia +
                ", nhaSanXuat='" + nhaSanXuat + '\'' +
                '}';
    }
}
