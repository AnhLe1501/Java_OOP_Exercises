package Exercise3;

public class ThiSinhKhoiC extends ThiSinh {
    private static final String MON_VAN = "Văn";
    private static final String MON_SU = "Sử";
    private static final String MON_DIA = "Địa";

    public ThiSinhKhoiC(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);

    }

    @Override
    public String toString() {
        return super.toString() + ", Khối C: " + MON_VAN + "-" + MON_SU + "-" + MON_DIA;
    }
}
