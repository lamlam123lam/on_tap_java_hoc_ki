package bai1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class VanBan {
    private String str;
    public VanBan() {
    }
    public VanBan(String st){
        this.str=st.trim();
    }
    public int DemSoTu(){
        StringTokenizer a = new StringTokenizer(this.str);
        return a.countTokens();
    }
    public int DemSoTu_ket_thuc_boi_G(){

        int count=0;
        if(str.endsWith("G")||str.endsWith("g")){
            count++;
        }
        for (int x=0;x<this.str.length()-2;x++){
            if(str.substring(x,x+2).equals("G ")||str.substring(x,x+2).equals("g ")){
                count++;
            }
        }
        return count;


    }
    public String prinnnt(){
        return str.toString();
    }
    public void ChuanHoa(){
        this.str=str.replaceAll("\s+", " ");
        System.out.println(this.str);
    }
}
