package demau1;

import java.util.Scanner;

public class nhanvien extends nguoi{
    Scanner sc = new Scanner(System.in);
    private String manv,phongban;
    private int luong;

    public nhanvien(String manv, String phongban, int luong) {
        super("huan", "chuong cho", 2003);
        this.manv = manv;
        this.phongban = phongban;
        this.luong = luong;
    }

    public nhanvien(){

    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getPhongban() {
        return phongban;
    }

    public void setPhongban(String phongban) {
        this.phongban = phongban;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }
}
