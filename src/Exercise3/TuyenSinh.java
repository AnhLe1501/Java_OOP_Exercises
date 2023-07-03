package Exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TuyenSinh {
    List<ThiSinh> dsThiSinh;
    public TuyenSinh() {
        dsThiSinh = new ArrayList<>();
    }
    public void themMoiThiSinh(ThiSinh thiSinh) {
        dsThiSinh.add(thiSinh);
    }
    public void hienThiThongTin() {
        if(!dsThiSinh.isEmpty()) {
            dsThiSinh.forEach(System.out::println);
        } else {
            System.out.println("Danh sách hiện trống, vui lòng thêm thí sinh");
        }
    }
    public void timKiemTheoSBD(String soBaoDanh) {
        List<ThiSinh> ketQua = dsThiSinh.stream()
                .filter(o -> o.getSoBaoDanh().equalsIgnoreCase(soBaoDanh))
                .collect(Collectors.toList());
        if(!ketQua.isEmpty()) {
            ketQua.forEach(System.out::println);
        } else {
            System.out.println("Không tìm thấy số báo danh: " + soBaoDanh);
        }
    }
}
