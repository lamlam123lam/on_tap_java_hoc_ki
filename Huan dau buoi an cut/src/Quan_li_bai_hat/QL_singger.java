package Quan_li_bai_hat;

import java.util.Scanner;

public class QL_singger {
    Scanner sc= new Scanner(System.in);
    int m;
    Singger[] arr;

    public QL_singger(int m, Singger[] arr) {
        this.m = m;
        this.arr = arr;
    }
    public QL_singger(){

    }

    public void nhap(){
        for (int i = 0; i < this.m; i++) {
            System.out.printf("bai hat [%d]",i);
            System.out.println("");
            Singger temp = new Singger();
            temp.nhap();
            arr[i]=new Singger(temp.getTenbaihat(), temp.getTheloai(),temp.getTencasi(),temp.getNamphathanh());
        }
    }
    public void tim_cac_ca_si_hat_nhac_rap(){
        System.out.println("Ten cac ca si hat the loai rap la : ");
        int i=0;
        for (Singger sg: arr) {
            if(sg.getTheloai().equals("rap")){
                System.out.println("["+i+"] ---- "+sg.getTencasi());
                i++;
            }
        }
    }
}
