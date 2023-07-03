package Exercise1_Ver1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLy {
    private List<CanBo> dsCanBo;
    public QuanLy() {
        this.dsCanBo = new ArrayList<>();
    }
    public void themMoiCanBo(CanBo canBo) {
        dsCanBo.add(canBo);
    }
    public void timKiemTheoHoTen(String hoTen) {
        List<CanBo> ketQua = dsCanBo.stream()
                .filter(canBo -> canBo.getHoTen().equalsIgnoreCase(hoTen))
                .collect(Collectors.toList());
        if (!ketQua.isEmpty()) {
            ketQua.forEach(System.out::println);
        } else {
            System.out.println("Không tìm thấy cán bộ có tên: " + hoTen );
        }
    }
    public void hienThiThongTin() {
        if (!dsCanBo.isEmpty()) {
            dsCanBo.forEach(System.out::println);
        } else {
            System.out.println("Danh sách hiện trống, vui lòng thêm mới cán bộ");
        }
    }
}
