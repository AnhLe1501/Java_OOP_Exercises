package Exercise3;

public class ThiSinhKhoiA extends ThiSinh {
    private static final String MON_TOAN = "Toán";
    private static final String MON_LY = "Lý";
    private static final String MON_HOA = "Hoá";

    public ThiSinhKhoiA(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);

    }

    @Override
    public String toString() {
        return super.toString() + ", Khối A: " + MON_TOAN + "-" + MON_LY + "-" + MON_HOA;
    }
}
