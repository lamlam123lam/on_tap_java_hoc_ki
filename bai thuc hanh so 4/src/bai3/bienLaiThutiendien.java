package bai3;

import java.util.Scanner;

public class bienLaiThutiendien {
    private thongtin_chuho tt;
    private double moi,cu;

    public bienLaiThutiendien(thongtin_chuho tt, double moi, double cu) {
        this.tt = tt;
        this.moi = moi;
        this.cu = cu;
    }

    public bienLaiThutiendien() {

    }


    }
    public thongtin_chuho getTt() {
        return tt;
    }

    public void setTt(thongtin_chuho tt) {
        this.tt = tt;
    }

    public double getMoi() {
        return moi;
    }

    public void setMoi(double moi) {
        this.moi = moi;
    }

    public double getCu() {
        return cu;
    }

    public void setCu(double cu) {
        this.cu = cu;
    }
}
