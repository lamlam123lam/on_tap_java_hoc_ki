package bai2;

public class hamMain {
    public static void main(String[] args) {
        // Thay string input tại đây, thích thì có thể tự viết hàm input
        Xau str = new Xau("cai dit cai con me nha may");
        System.out.println("------------------------------------------------------");
        System.out.println("");
        str.Dem_ki_tu_xuat_hien_nhieu_nhat();
        System.out.println("------------------------------------------------------");
        System.out.println("");
        str.Kiem_tra_chuoi_dao_nguoc("yam ahn em noc iac tid iac");
        System.out.println("------------------------------------------------------");
        System.out.println("");
        str.Kiem_tra_ki_tu_xuat_hien_1_lan_duy_nhat('a'); // vi ki tu a xuat hien nhieu hon 2 lan nen ko la duy nhat
        str.Kiem_tra_ki_tu_xuat_hien_1_lan_duy_nhat('e'); // e chi xuat hien 1 lan
        System.out.println("------------------------------------------------------");
        System.out.println("");
        str.Tra_ve_1_Xau_dao_nguoc();
        System.out.println("------------------------------------------------------");
        System.out.println("");
        str.Dem_so_luong_nguyen_am_phu_am();
    }
}
