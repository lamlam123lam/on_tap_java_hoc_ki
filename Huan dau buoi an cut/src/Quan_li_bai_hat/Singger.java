package Quan_li_bai_hat;

public class Singger extends baiHat{
    private String tencasi;
    private int namphathanh;

    public Singger(String tenbaihat, String theloai, String tencasi, int namphathanh) {
        super(tenbaihat, theloai);
        this.tencasi = tencasi;
        this.namphathanh = namphathanh;
    }

    public Singger() {

    }


    public String getTencasi() {
        return tencasi;
    }

    public void setTencasi(String tencasi) {
        this.tencasi = tencasi;
    }

    public int getNamphathanh() {
        return namphathanh;
    }

    public void setNamphathanh(int namphathanh) {
        this.namphathanh = namphathanh;
    }
    public void nhap(){
        super.nhapTT();
        System.out.print("Nhap vao ten ca si : ");
        this.tencasi=sc.nextLine();
        System.out.print("Nhap vao nam phat hanh : ");
        this.namphathanh=sc.nextInt();
        sc.nextLine();

    }

    @Override
    public void hienthiTT() {
        System.out.println("Thong tin cua bai hat la : ");
        super.hienthiTT();
        System.out.println("Nhap vao ten ca si : "+this.tencasi);
        System.out.println("Nhap vao nam phat hanh : "+this.namphathanh);
    }
}
