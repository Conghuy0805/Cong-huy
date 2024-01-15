package Compareto;

import org.jetbrains.annotations.NotNull;

public class SinhVien implements Comparable<SinhVien> {
    private int id;
    private String name;
    private String classes;
    private double diemTB;

    public SinhVien(int id, String name, String classes, double diemTB) {
        this.id = id;
        this.name = name;
        this.classes = classes;
        this.diemTB = diemTB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "id=" + id + ", name='" + name + '\'' + ", classes='" + classes + '\'' + ", diemTB=" + diemTB + '}';
    }

    public String getTen() {
        String s = this.name.trim();
        if (s.indexOf(" ") >= 0) {
            int vt = s.lastIndexOf(" ");
            return s.substring(vt + 1);
        }
        return s;
    }


    @Override
    public int compareTo(SinhVien o) {
//        Dựa trên so sánh tên
        String tenThis = this.getTen();
        String tenO = o.getTen();
        return tenThis.compareTo(tenO);

//        // Dựa trên so sánh điểm trung bình
//        Integer diemThis = (int) this.getDiemTB();
//        Integer diemO = (int) o.getDiemTB();
//        return diemThis.compareTo(diemO);

    }
}
