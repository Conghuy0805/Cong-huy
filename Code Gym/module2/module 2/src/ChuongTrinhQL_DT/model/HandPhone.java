package ChuongTrinhQL_DT.model;

public class HandPhone extends Phone{
    private String quocGia;
    private String status;

    public HandPhone(String quocGia, String status) {
        this.quocGia = quocGia;
        this.status = status;
    }

    public HandPhone(int id, String name, double price, String manufacturer, String quocGia, String status) {
        super(id, name, price, manufacturer);
        this.quocGia = quocGia;
        this.status = status;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "HandPhone{" +
                "quocGia='" + quocGia + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
