package Exercise1_Ver2;

public class NhanVien extends CanBo {
    private String congViec;
    public NhanVien(String hoTen, Integer tuoi, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }
    public String getCongViec() {
        return congViec;
    }
    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return super.toString() + ", Công việc: " + congViec;
    }
}
