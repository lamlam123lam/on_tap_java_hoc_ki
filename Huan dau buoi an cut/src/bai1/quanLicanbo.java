package bai1;

import java.util.Scanner;
public class quanLicanbo {
    canBo[] cb2=null;
    Scanner sc = new Scanner(System.in);

    public quanLicanbo() {
    }
    public void nhapxuat(canBo[] mang){
        for (int i = 0; i < mang.length; i++) {
            System.out.println("Nhap vao thong tin cac bo thu [" + i + "]");
            System.out.print("Nhap vao ten : ");
            String ten = sc.nextLine();
            System.out.print("Nhap vao nam sinh : ");
            String namsinh = sc.nextLine();
            System.out.print("Nhap vao gioi tinh : ");
            String gioitinh = sc.nextLine();
            System.out.print("Nhap vao dia chi : ");
            String diachi = sc.nextLine();
            mang[i] = new canBo(ten, namsinh, gioitinh, diachi);

        }
        System.out.println("Thong tin danh sach can bo :");
        for (canBo cb1 : mang) {

            System.out.println("--" + cb1.getHoTen() + ",  " + cb1.getNamSinh() + ",  " + cb1.getGioiTinh() + ",  " + cb1.getDiaChi());
        }
        cb2=mang;
    }

    public void timtheoten(canBo[] mang){

        System.out.print("Nhap ten muon tim kiem :"); String othername=sc.nextLine();
        int check =-1;
        for (int i=0; i<mang.length;i++) {
            if(mang[i].getHoTen().equals(othername)){
                check = 1;
                System.out.println("Da tim thay ten cac bo !");
                System.out.printf("vi tri tim thay la : [%d]",i);
                System.out.println("");
                System.out.println("--" + mang[i].getHoTen() + ",  " + mang[i].getNamSinh() + ",  " + mang[i].getGioiTinh() + ",  " + mang[i].getDiaChi());
                break;
            }

        }
        if(check==-1){
            System.out.println("khong tim thay");
        }

    }
}
