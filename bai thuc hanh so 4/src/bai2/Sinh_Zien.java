package bai2;

public class Sinh_Zien {
private String hoTen,lop;
private Ngay_thang_nam NamSinh;


    public Sinh_Zien(String hoTen, String lop, Ngay_thang_nam namSinh) {
        this.hoTen = hoTen;
        this.lop = lop;
        NamSinh = namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public Ngay_thang_nam getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(Ngay_thang_nam namSinh) {
        NamSinh = namSinh;
    }
}
