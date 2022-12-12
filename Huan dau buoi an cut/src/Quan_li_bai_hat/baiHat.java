package Quan_li_bai_hat;

import java.util.Scanner;

public class baiHat {
    Scanner sc= new Scanner(System.in);
    private String tenbaihat,theloai;

    public baiHat(String tenbaihat, String theloai) {
        this.tenbaihat = tenbaihat;
        this.theloai = theloai;
    }
    public baiHat(){

    }

    public String getTenbaihat() {
        return tenbaihat;
    }

    public void setTenbaihat(String tenbaihat) {
        this.tenbaihat = tenbaihat;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }
    public void nhapTT(){
        System.out.print("Nhap ten bai hat : ");
        this.tenbaihat=sc.nextLine();
        System.out.print("Nhap the loai bai hat : ");
        this.theloai=sc.nextLine();
    }
    public void hienthiTT(){
        System.out.println("Ten bai hat : "+tenbaihat);
        System.out.println("The loai bai hat : "+theloai);
    }
}
