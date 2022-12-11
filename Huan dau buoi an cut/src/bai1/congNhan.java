package bai1;

public class congNhan extends  canBo{
    private int capBac;

    public congNhan(String hoTen, String namSinh, String gioiTinh, String diaChi, int capBac) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.capBac = capBac;
    }

    public int getCapBac() {
        return capBac;
    }

    public void setCapBac(int capBac) {
        this.capBac = capBac;
    }
}
