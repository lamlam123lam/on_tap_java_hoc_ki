package Quan_li_tai_lieu;

import java.util.Scanner;

public class TaiLieu {
    Scanner sc= new Scanner(System.in);
    private  String tentailieu,tentacgia;

    public TaiLieu(String tentailieu, String tentacgia) {
        this.tentailieu = tentailieu;
        this.tentacgia = tentacgia;
    }
    public TaiLieu(){
    }
    public void nhapTT(){
        System.out.print("Nhap ten tai lieu : ");
        this.tentailieu=sc.nextLine();
        System.out.print("Nhap ten tac gia : ");
        this.tentacgia=sc.nextLine();
    }
    public void hienthiTT(){
        System.out.println("Thong tin cua tai lieu la :");
        System.out.println("Ten tai lieu : "+this.tentailieu);
        System.out.println("Ten tac gia : "+this.tentacgia);

    }

    public String getTentailieu() {
        return tentailieu;
    }

    public void setTentailieu(String tentailieu) {
        this.tentailieu = tentailieu;
    }

    public String getTentacgia() {
        return tentacgia;
    }

    public void setTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }
}
