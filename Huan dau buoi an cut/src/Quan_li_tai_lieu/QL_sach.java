package Quan_li_tai_lieu;

public class QL_sach {
    sach[] arr;

    public QL_sach(sach[] arr) {
        this.arr = arr;
    }

    public void nhapTT(){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("- Sach thu [%d] ",i);
            sach temp = new sach();
            temp.nhapTT();
            arr[i]=new sach(temp.getTentailieu(),temp.getTentacgia(),temp.getTenNSX(), temp.getNamXB());
        }
    }
    public void hienthi(){
        System.out.println("Danh sach thong tin sach vua nhap la :");
        for (sach ss: arr) {
            System.out.println(ss.getTentailieu()+",  "+ss.getTentacgia()+",  "+ss.getTenNSX()+",  "+ss.getNamXB());
        }
    }
}
