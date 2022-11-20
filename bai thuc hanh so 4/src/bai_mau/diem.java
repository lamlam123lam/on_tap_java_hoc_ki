package bai_mau;

import java.util.Scanner;

public class diem {
    private double x,y;

    public diem(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public diem(){

    }
    public void NhapDiem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao X : ");
        this.x=sc.nextDouble();
        System.out.println("Nhap vao Y : ");
        this.y=sc.nextDouble();
    }
    public void inTTDiem(){
        System.out.println("Gia tri cua x :  "+this.x);
        System.out.println("Gia tri cua y :  "+this.y);
        System.out.println("");
    }
    public double Tinh_Khoang_Cach_Diem(diem d1){
        return Math.sqrt((this.x-d1.x)*(this.x-d1.x)+(this.y-d1.y)*(this.y-d1.y));
    }
}
