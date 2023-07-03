package Exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLy {
    private List<HocSinh> dsHocSinh;
    public QuanLy() {
        this.dsHocSinh = new ArrayList<>();
    }
    public List<HocSinh> getHocSinh() {
        return dsHocSinh;
    }
    public void setHocSinh(List<HocSinh> hocSinh) {
        this.dsHocSinh = hocSinh;
    }
    public void themMoiHocSinh(HocSinh hocSinh) {
        this.dsHocSinh.add(hocSinh);
    }
    public void hienThiHocSinh20Tuoi() {
        List<HocSinh> ketQua = dsHocSinh.stream()
                .filter(hocSinh -> hocSinh.getTuoi() == 20)
                .collect(Collectors.toList());
        if(!ketQua.isEmpty()) {
            ketQua.forEach(System.out::println);
        } else {
            System.out.println("Không có học sinh nào 20 tuổi");
        }
    }
    public void soHocSinh23TuoiDN() {
        long soLuong = this.dsHocSinh.stream()
                .filter(o -> o.getTuoi() == 23 && o.getQueQuan().equals("DN"))
                .count();
        System.out.println(soLuong);
    }
}
