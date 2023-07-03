package Exercise6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLy quanLy = new QuanLy();
        quanLy.themMoiHocSinh(new HocSinh("Nguyễn Văn A", 23,"DN"));
        quanLy.themMoiHocSinh(new HocSinh("Nguyễn Văn B", 23,"HG"));
        quanLy.themMoiHocSinh(new HocSinh("Nguyễn Văn C", 23,"DN"));
        quanLy.themMoiHocSinh(new HocSinh("Nguyễn Văn D", 20,"DN"));
        quanLy.themMoiHocSinh(new HocSinh("Nguyễn Văn E", 19,"HN"));
        quanLy.themMoiHocSinh(new HocSinh("Nguyễn Văn F", 20,"HN"));

        System.out.println("Danh sách học sinh 20 tuổi: ");
        quanLy.hienThiHocSinh20Tuoi();
        System.out.print("Số lượng học sinh 23 tuổi quê ở DN: ");
        quanLy.soHocSinh23TuoiDN();

    }
}
