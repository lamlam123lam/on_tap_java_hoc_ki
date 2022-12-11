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

    public String getSoPhieuMuon() {
        return SoPhieuMuon;
    }

    public void setSoPhieuMuon(String soPhieuMuon) {
        SoPhieuMuon = soPhieuMuon;
    }

    public String getSoHieuSach() {
        return SoHieuSach;
    }

    public void setSoHieuSach(String soHieuSach) {
        SoHieuSach = soHieuSach;
    }

    public Ngay_thang_nam getNgayMuon() {
        return NgayMuon;
    }

    public void setNgayMuon(Ngay_thang_nam ngayMuon) {
        NgayMuon = ngayMuon;
    }

    public Ngay_thang_nam getNgayTra() {
        return NgayTra;
    }

    public void setNgayTra(Ngay_thang_nam ngayTra) {
        NgayTra = ngayTra;
    }

    public Sinh_Zien getSv() {
        return sv;
    }

    public void setSv(Sinh_Zien sv) {
        this.sv = sv;
    }
}
