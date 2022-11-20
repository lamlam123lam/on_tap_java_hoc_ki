public class mau {
    public static void main(String[] args) {
        diem d1=new diem();
        diem d2=new diem();
        d1.NhapDiem();
        d2.NhapDiem();
        d1.inTTDiem();
        d2.inTTDiem();
        System.out.println("Khoang cach giua hai diem la : "+d1.Tinh_Khoang_Cach_Diem(d2));

    }
}
