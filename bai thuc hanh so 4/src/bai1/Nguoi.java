package bai1;

import java.util.Scanner;

public class Nguoi {
    private String hoTen,DiaChi;
    private int NamSinh;

    public Nguoi(String hoTen, String diaChi, int namSinh) {
        this.hoTen = hoTen;
        DiaChi = diaChi;
        NamSinh = namSinh;
    }
    public Nguoi(){

    }
    public void Nhap(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap ho va Ten : ");
        this.hoTen=sc.nextLine();
        System.out.print("Nhap dia chi : ");
        this.DiaChi=sc.nextLine();
        System.out.print("Nhap nam sinh : ");
        this.NamSinh=sc.nextInt();

    }
    public void inTT(){
        System.out.println("Ho va Ten : "+ this.hoTen);

        System.out.println("Dia chi : "+this.DiaChi);

        System.out.println("Nam sinh : "+this.NamSinh);

    }
}
