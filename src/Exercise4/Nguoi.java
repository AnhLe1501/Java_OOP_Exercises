package Exercise4;

public class Nguoi {
    private String hoTen;
    private int tuoi;
    private String ngheNghiep;
    private String soCanCuoc;
    public Nguoi(String hoTen, int tuoi, String ngheNghiep, String soCanCuoc) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.ngheNghiep = ngheNghiep;
        this.soCanCuoc = soCanCuoc;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public String getNgheNghiep() {
        return ngheNghiep;
    }
    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }
    public String getSoCanCuoc() {
        return soCanCuoc;
    }
    public void setSoCanCuoc(String soCanCuoc) {
        this.soCanCuoc = soCanCuoc;
    }

    @Override
    public String toString() {
        return "Họ tên: " + hoTen +
                ", Tuổi: " + tuoi +
                ", Nghề nghiệp: " + ngheNghiep +
                ", Số căn cước: " + soCanCuoc;
    }
}
