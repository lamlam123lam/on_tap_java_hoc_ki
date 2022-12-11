package bai3;

public class thongtin_chuho {
    private String hoten,soNha,maSoCongTo;

    public thongtin_chuho(String hoten, String soNha, String maSoCongTo) {
        this.hoten = hoten;
        this.soNha = soNha;
        this.maSoCongTo = maSoCongTo;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public String getMaSoCongTo() {
        return maSoCongTo;
    }

    public void setMaSoCongTo(String maSoCongTo) {
        this.maSoCongTo = maSoCongTo;
    }
}
