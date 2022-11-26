package bai1;

import java.util.Scanner;

public class hammain {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap vao ki tu : ");
        String str=sc.nextLine();
        VanBan st = new VanBan(str);
        System.out.println("So tu trong chuoi la : "+st.DemSoTu());
        System.out.println("So tu ket thuc bang G : "+st.DemSoTu_ket_thuc_boi_G());
        System.out.println("Truoc khi chuan hoa : "+st.prinnnt());
        System.out.print("Sau khi chuan hoa : ");st.ChuanHoa();




    }
}
