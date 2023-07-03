package Exercise1_Ver2;

import java.util.ArrayList;
import java.util.List;

public class QuanLy {
    private List<CanBo> dsCanBo;
    public QuanLy() {
        this.dsCanBo = new ArrayList<>();
    }
    public void themMoiCanBo(CanBo canBo) {
        dsCanBo.add(canBo);
    }
    public void timKiemTheoHoTen(String hoTen) {
        boolean timKiem = false;
        for (CanBo canBo : dsCanBo) {
            if (canBo.getHoTen().equalsIgnoreCase(hoTen)) {
                System.out.println(canBo);
                timKiem = true;
            }
        }
        if(!timKiem) {
            System.out.println("Khong tim thay can bo co ten: " + hoTen);
        }
    }
    public void hienThiThongTin() {
        if(!dsCanBo.isEmpty()) {
        for (CanBo canBo : dsCanBo) {
            System.out.println(canBo);
        }
        } else {
            System.out.println("Danh sach hien khong co ai");
        }
    }
}
