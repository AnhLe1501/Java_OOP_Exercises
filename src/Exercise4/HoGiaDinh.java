package Exercise4;

import java.util.ArrayList;
import java.util.List;

public class HoGiaDinh {
    private List<Nguoi> nguoi;
    private int soNguoi;
    private int soNha;

    public HoGiaDinh(int soNha, int soNguoi) {
        this.soNguoi = soNguoi;
        this.soNha = soNha;
        this.nguoi = new ArrayList<>();
    }
    public void themNguoi(Nguoi nguoi) {
        this.nguoi.add(nguoi);
    }
    public List<Nguoi> getNguoi() {
        return nguoi;
    }
    public void setNguoi(List<Nguoi> nguoi) {
        this.nguoi = nguoi;
    }
    public int getSoNguoi() {
        return soNguoi;
    }
    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }
    public int getSoNha() {
        return soNha;
    }
    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    @Override
    public String toString() {
        return "Gia đình {" +
                "Số thành viên: " + soNguoi +
                ", Số nhà: " + soNha +
                ", Thành viên[ " + nguoi + "]}";
    }
}
