package ss7_abstractClass_interface.thuc_hanh.ClassPhuongTien;

public abstract class PhuongTienDiChuyen {
    protected String tenLoaiPhuongTien;
    protected HangSanXuat hangSanXuat; // khai báo biến tham chiếu có tên hangSanXuat thuộc loại HangSanXuat,là một lớp

    public PhuongTienDiChuyen(String tenLoaiPhuongTien, HangSanXuat hangSanXuat) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }

    public String getTenLoaiPhuongTien() {
        return tenLoaiPhuongTien;
    }

    public void setTenLoaiPhuongTien(String tenLoaiPhuongTien) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
    }

    public String layTenHangSanXuat() {
        return this.hangSanXuat.getTenHangSanXuat();
    }

    public void batDau() {
        System.out.println("Bắt đầu ...");
    }

    public void tangToc() {
        System.out.println("Tăng tốc ...");
    }

    public void dungLai() {
        System.out.println("Dừng lại ...");
    }

    public abstract double layVanToc();

}
