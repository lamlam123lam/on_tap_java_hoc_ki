package demau1;

import java.util.Scanner;

public class quanlinv {
    Scanner sc = new Scanner(System.in);
    int n;
    nhanvien[] nv;

    public quanlinv(int n, nhanvien[] nv) {
        this.n = n;
        this.nv = nv;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public nhanvien[] getNv() {
        return nv;
    }

    public void setNv(nhanvien[] nv) {
        this.nv = nv;
    }
    public void nhapxuat(){
        for (int i = 0; i < nv.length; i++) {
            sc.nextLine();
            System.out.print("Nhap ma nhan vien :"); String manv=sc.nextLine();
            System.out.print("Nhap vao phong ban :"); String pb=sc.nextLine();
            System.out.print("Nhap vao luong:"); int luong = sc.nextInt();
            nv[i]=new nhanvien(manv,pb,luong);
        }
        for (nhanvien nv1 : nv) {
            System.out.println(nv1.getHoten()+"  "+nv1.getManv()+"  "+nv1.getPhongban()+" "+nv1.getLuong());
        }
    }
}
