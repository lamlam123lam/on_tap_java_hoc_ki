package bai1;

import java.util.Scanner;

public class hammain {
    public static void main(String[] args) {
        System.out.print("Nhap vao so luong can bo: ");
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        canBo[] mang= new canBo[N];
        new quanLicanbo().nhapxuat(mang);
        new quanLicanbo().timtheoten(mang);


    }
}
