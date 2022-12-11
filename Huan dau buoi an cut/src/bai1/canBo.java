package bai1;

public class canBo {
    private String  HoTen,NamSinh,GioiTinh,DiaChi;

    public canBo(String hoTen, String namSinh, String gioiTinh, String diaChi) {
        HoTen = hoTen;
        NamSinh = namSinh;
        GioiTinh = gioiTinh;
        DiaChi = diaChi;
    }
    public canBo(){

    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(String namSinh) {
        NamSinh = namSinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }
}
