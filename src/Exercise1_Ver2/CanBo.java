package Exercise1_Ver2;

public class CanBo {
    private String hoTen;
    private Integer tuoi;
    private String gioiTinh;
    private String diaChi;
    public CanBo(String hoTen, Integer tuoi, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public Integer getTuoi() {
        return tuoi;
    }
    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }
    public String getGioiTinh() {
        return gioiTinh;
    }
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Ho tên: " + hoTen +
                ", Tuổi: " + tuoi +
                ", Giới tính: " + gioiTinh +
                ", Địa chỉ: " + diaChi;
    }
}
