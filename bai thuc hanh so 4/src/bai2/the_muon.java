package bai2;

public class the_muon {
    private String SoPhieuMuon,SoHieuSach;
    private Ngay_thang_nam NgayMuon,NgayTra;
    private Sinh_Zien sv;

    public the_muon(String soPhieuMuon, String soHieuSach, Ngay_thang_nam ngayMuon, Ngay_thang_nam ngayTra, Sinh_Zien sv) {
        SoPhieuMuon = soPhieuMuon;
        SoHieuSach = soHieuSach;
        NgayMuon = ngayMuon;
        NgayTra = ngayTra;
        this.sv = sv;
    }

}
