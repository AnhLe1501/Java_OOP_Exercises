package Exercise3;

public class ThiSinhKhoiB extends ThiSinh {
    private static final String MON_TOAN = "Toán";
    private static final String MON_HOA = "Hoá";
    private static final String MON_SINH = "Sinh";

    public ThiSinhKhoiB(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);

    }

    @Override
    public String toString() {
        return super.toString() + ", Khối B: " + MON_TOAN + "-" + MON_HOA + "-" + MON_SINH;
    }
}
