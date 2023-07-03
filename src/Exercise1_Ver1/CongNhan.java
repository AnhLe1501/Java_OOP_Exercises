package Exercise1_Ver1;

public class CongNhan extends CanBo {
    private Integer capBac;
    public CongNhan(String hoTen, Integer tuoi, String gioiTinh, String diaChi, Integer capBac) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.capBac = capBac;
    }
    public Integer getCapBac() {
        return capBac;
    }
    public void setCapBac(Integer capBac) {
        this.capBac = capBac;
    }

    @Override
    public String toString() {
        return super.toString() + ", Bậc: " + capBac;
    }
}
