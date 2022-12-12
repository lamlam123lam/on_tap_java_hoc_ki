package Quan_li_bai_hat;

import java.util.Scanner;

public class ham_Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // BỎ DẤU XƯỢC TRƯỚC CÁC LỆNH ĐỂ CHẠY
//        baiHat bh = new baiHat("con cac","nhac boc lua cuc cang");
//        bh.nhapTT();
//        bh.hienthiTT();

        //---------------- singer-----------------------

//        Singger sg= new Singger();
//        sg.nhap();
//        sg.hienthiTT();

        //----------------QUAN LI singer-----------------------

        System.out.print("nhap vao so luong bai hat : ");
        int n= sc.nextInt();
        Singger[] arr = new Singger[n];
        QL_singger ql= new QL_singger(n,arr);
        ql.nhap();
        ql.tim_cac_ca_si_hat_nhac_rap();


    }
}
