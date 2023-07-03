package Exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TuyenSinh tuyenSinh = new TuyenSinh();

        while (true) {
            System.out.println("----Quản Lý Sinh Viên Thi Đại Học----");
            System.out.println("1. Thêm mới thí sinh");
            System.out.println("2. Hiển thị thông tin thí sinh");
            System.out.println("3. Tìm kiếm theo số báo danh");
            System.out.println("4. Thoát khỏi chương trình");
            System.out.println("Nhập vào lựa chọn của bạn: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Nhập khối thi (1,2,3)");
                    System.out.print("1 - Khối A; 2 - Khối B; 3 - Khối C: ");
                    int khoiThi = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhập số báo danh: ");
                    String soBaoDanh = sc.nextLine();
                    System.out.print("Nhập họ tên: ");
                    String hoTen = sc.nextLine();
                    System.out.print("Nhập địa chỉ: ");
                    String diaChi = sc.nextLine();
                    System.out.print("Nhập mức ưu tiên: ");
                    int mucUuTien = sc.nextInt();
                    sc.nextLine();
                    if (khoiThi == 1) {
                        tuyenSinh.themMoiThiSinh(new ThiSinhKhoiA(soBaoDanh, hoTen, diaChi, mucUuTien));
                    } else if (khoiThi == 2) {
                        tuyenSinh.themMoiThiSinh(new ThiSinhKhoiB(soBaoDanh, hoTen, diaChi, mucUuTien));
                    } else if (khoiThi == 3) {
                        tuyenSinh.themMoiThiSinh(new ThiSinhKhoiC(soBaoDanh, hoTen, diaChi, mucUuTien));
                    }
                    break;

                case 2:
                    System.out.println("----Danh sách thí sinh----");
                    tuyenSinh.hienThiThongTin();
                    break;

                case 3:
                    System.out.println("Nhập vào số báo danh: ");
                    String soBaoDanhCanTim = sc.nextLine();
                    tuyenSinh.timKiemTheoSBD(soBaoDanhCanTim);
                    break;

                case 4:
                    System.out.println("Thoát");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    continue;
            }
        }
    }
}
