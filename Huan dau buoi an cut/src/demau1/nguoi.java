package demau1;

public class nguoi {
    private String hoten, diachi;
    private int namsinh;

    public nguoi(String hoten, String diachi, int namsinh) {
        this.hoten = hoten;
        this.diachi = diachi;
        this.namsinh = namsinh;
    }
    public nguoi() {

    }
    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }
    public int tinhtuoi(){
        return 2022-this.namsinh;
    }
}
