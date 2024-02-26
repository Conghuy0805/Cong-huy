package ChuongTrinhQL_DT.model;

public class AuthenticPhone extends Phone{
    private int thoiGianBaoHanh;
    private int maSoBaoHanh;

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public int getMaSoBaoHanh() {
        return maSoBaoHanh;
    }

    public void setMaSoBaoHanh(int maSoBaoHanh) {
        this.maSoBaoHanh = maSoBaoHanh;
    }

    public AuthenticPhone(int thoiGianBaoHanh, int maSoBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.maSoBaoHanh = maSoBaoHanh;
    }

    public AuthenticPhone(int id, String name, double price, String manufacturer, int thoiGianBaoHanh, int maSoBaoHanh) {
        super(id, name, price, manufacturer);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.maSoBaoHanh = maSoBaoHanh;

    }

    @Override
    public String toString() {
        return "AuthenticPhone{" +
                "thoiGianBaoHanh=" + thoiGianBaoHanh +
                ", maSoBaoHanh=" + maSoBaoHanh +
                '}';
    }
}
