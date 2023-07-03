package Exercise4;

import java.util.ArrayList;
import java.util.List;

public class KhuPho {
    private List<HoGiaDinh> dsGiaDinh;
    public KhuPho() {
        dsGiaDinh = new ArrayList<>();
    }
    public void themGiaDinh(HoGiaDinh hoGiaDinh) {
        dsGiaDinh.add(hoGiaDinh);
    }
    public void hienThiThongTin() {
        dsGiaDinh.forEach(hoGiaDinh -> {
            System.out.println("Số thành viên: " + hoGiaDinh.getSoNguoi());
            System.out.println("Số nhà: " + hoGiaDinh.getSoNha());
            System.out.println("Danh sách thành viên gia đình: ");
            hoGiaDinh.getNguoi().forEach(nguoi -> {
                System.out.println("Họ tên: " + nguoi.getHoTen());
                System.out.println("Tuổi: " + nguoi.getTuoi());
                System.out.println("Nghề nghiệp: " + nguoi.getNgheNghiep());
                System.out.println("Số căn cước: " + nguoi.getSoCanCuoc());
            });
            System.out.println();
        });
    }
}
