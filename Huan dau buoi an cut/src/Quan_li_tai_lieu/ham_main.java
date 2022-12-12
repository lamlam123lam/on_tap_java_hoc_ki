package Quan_li_tai_lieu;

import Quan_li_bai_hat.QL_singger;
import Quan_li_bai_hat.Singger;

import java.util.Scanner;

public class ham_main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //-------------------- cau 1-----------------
//        TaiLieu tl = new TaiLieu();
//        tl.nhapTT();
//        tl.hienthiTT();

        //-------------- cau 2 --------------//


//        sach s= new sach();
//        s.nhapTT();
//        s.hienthiTT();

        //---------------cau 3-------------
        System.out.print("nhap vao so luong sach : ");
        int n= sc.nextInt();
        sach[] s= new sach[n];
        QL_sach ql= new QL_sach(s);
        ql.nhapTT();
        ql.hienthi();

    }
}
