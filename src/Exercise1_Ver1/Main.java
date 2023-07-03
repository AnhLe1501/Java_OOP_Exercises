package Exercise1_Ver1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLy qlcb = new QuanLy();

        while (true) {
            System.out.println("----- Quản lý cán bộ -----");
            System.out.println("1. Thêm mới cán bộ.");
            System.out.println("2. Tìm kiếm theo họ tên.");
            System.out.println("3. Hiển thị thông tin về danh sách các cán bộ.");
            System.out.println("4. Thoát khỏi chương trình.");
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character from the input buffer

            switch (choice) {
                case 1:
                    System.out.print("Nhập loại cán bộ (1 - Công nhân, 2 - Kỹ sư, 3 - Nhân viên): ");
                    int loaiCanBo = scanner.nextInt();
                    scanner.nextLine(); // Clear the newline character from the input buffer

                    System.out.print("Nhập họ tên: ");
                    String hoTen = scanner.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int tuoi = scanner.nextInt();
                    scanner.nextLine(); // Clear the newline character from the input buffer
                    System.out.print("Nhập giới tính: ");
                    String gioiTinh = scanner.nextLine();
                    System.out.print("Nhập địa chỉ: ");
                    String diaChi = scanner.nextLine();

                    if (loaiCanBo == 1) {
                        System.out.print("Nhập bậc (1 đến 10): ");
                        int bac = scanner.nextInt();
                        qlcb.themMoiCanBo(new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac));
                    } else if (loaiCanBo == 2) {
                        System.out.print("Nhập ngành đào tạo: ");
                        String nganhDaoTao = scanner.nextLine();
                        qlcb.themMoiCanBo(new KySu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao));
                    } else if (loaiCanBo == 3) {
                        System.out.print("Nhập công việc: ");
                        String congViec = scanner.nextLine();
                        qlcb.themMoiCanBo(new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec));
                    } else {
                        System.out.println("Lựa chọn không hợp lệ.");
                    }
                    break;

                case 2:
                    System.out.print("Nhập họ tên cần tìm kiếm: ");
                    String hoTenCanTim = scanner.nextLine();
                    qlcb.timKiemTheoHoTen(hoTenCanTim);
                    break;

                case 3:
                    System.out.println("----- Danh sách cán bộ -----");
                    qlcb.hienThiThongTin();
                    break;

                case 4:
                    System.out.println("Thoát khỏi chương trình.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    continue;
            }
        }
    }
}
