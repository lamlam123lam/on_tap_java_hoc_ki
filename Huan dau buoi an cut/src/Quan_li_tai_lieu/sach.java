package Quan_li_tai_lieu;

public class sach extends TaiLieu{
    private String tenNSX;
    private int namXB;

    public sach(String tentailieu, String tentacgia, String tenNSX, int namXB) {
        super(tentailieu, tentacgia);
        this.tenNSX = tenNSX;
        this.namXB = namXB;
    }
    public sach(){}

    public String getTenNSX() {
        return tenNSX;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }

    public int getNamXB() {
        return namXB;
    }

    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }

    @Override
    public void nhapTT() {
        super.nhapTT();
        System.out.print("Nhap vao ten nha san xuat : ");
        this.tenNSX=sc.nextLine();
        System.out.print("Nhap vao nam xuat ban : ");
        this.namXB=sc.nextInt();
        sc.nextLine();
    }

    @Override
    public void hienthiTT() {
        super.hienthiTT();
        System.out.println("Ten nha san xuat : "+this.tenNSX);
        System.out.println("Nam xuat ban : "+this.namXB);

    }
}
