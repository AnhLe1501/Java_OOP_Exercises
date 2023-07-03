package Exercise1_Ver2;

public class KySu extends CanBo {
    private String chuyenNganh;
    public KySu(String hoTen, Integer tuoi, String gioiTinh, String diaChi, String chuyenNganh) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.chuyenNganh = chuyenNganh;
    }
    public String getChuyenNganh() {
        return chuyenNganh;
    }
    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String toString() {
        return super.toString() + ", Ngành đào tạo: " + chuyenNganh;
    }
}
