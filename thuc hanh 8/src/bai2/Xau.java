package bai2;

import java.util.HashMap;
import java.util.Objects;

public class Xau {
    private String str ;

    public Xau(String str) {
        this.str = str;
    }
    public Xau(){

    }
    public void Dem_ki_tu_xuat_hien_nhieu_nhat() {
        //Su dung hash map nen hoi dai`

        this.str=str.toLowerCase();
        char ch,temp = 0;
        int count=-1;
        int max=-1;
        HashMap<Character,Integer> hs = new HashMap<Character,Integer>();
        for (int i = 0; i <str.length() ; i++) {
            ch = str.charAt(i);
            if(hs.containsKey(ch)){
                count=hs.get(ch);
                count++;
                hs.put(ch,count);
                if((hs.get(ch)>max)&&ch!=' '){
                    max=hs.get(ch);
                    temp=ch;
                }
            }

            else {
                hs.put(ch,1);
            }
        }
        if(count==-1){
            System.out.println("Khong co ki tu xuat hien nhieu nhat !");
        }
        else
            System.out.println("Ki tu xuat hien nhieu nhat la : [ "+temp+" ] xuat hien "+hs.get(temp)+" lan");
    }
    public void Kiem_tra_chuoi_dao_nguoc(String ChuoiNgoai){
        StringBuilder str1= new StringBuilder();
        str1.append(ChuoiNgoai);
        str1.reverse();
        System.out.println("Kiem tra chuoi dao nguoc : "+str.equals(str1.toString()));
    }
    public void Kiem_tra_ki_tu_xuat_hien_1_lan_duy_nhat(char ch){
        // Ở đây sẽ sử dụng hash map để độ phức tạp của thuật toán còn O(n) khi push vào map
        // còn khi truy xuất thì rất nhanh O(1) vì Ló truy cập trực tiếp qua key
        char c;
        int count;
        HashMap<Character,Integer> hs = new HashMap<Character,Integer>();
        // Thực hiện đẩy các charactor vào map
        for (int i = 0; i < str.length(); i++) {
            c=str.charAt(i);
            if(hs.containsKey(c)){
                count=hs.get(c);
                count++;
                hs.put(c,count);
            }

            else {
                hs.put(c,1);
            }
        }
        if(hs.get(ch)==1){
            System.out.println("[ "+ch+" ] La duy nhat");
        }
        else {
            System.out.println("[ "+ch+" ] Deo la duy nhat");
        }
    }
    public void Tra_ve_1_Xau_dao_nguoc(){
        StringBuilder str1= new StringBuilder();
        str1.append(this.str);
        str1.reverse();
        System.out.println("Chuoi truoc khi dao nguoc : "+str);
        System.out.println("Chuoi sau khi dao nguoc : "+str1);
    }
    public void Dem_so_luong_nguyen_am_phu_am(){
        // Ai cham thi tu viet switch case nhe luoi lam =))))
        int nguyen_am=0;
        for (int i = 0; i < str.length(); i++) {
            char a=str.charAt(i);
            if(a=='u'||a=='e'||a=='o'||a=='a'||a=='i'){
                nguyen_am++;
            }
        }
        int b=str.length();
        System.out.println("So luong nguyen am :"+nguyen_am);
        System.out.println("So luong phu am :"+(b-nguyen_am));

    }


}
