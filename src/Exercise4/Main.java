package Exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KhuPho khuPho = new KhuPho();
        System.out.println("Nhập số lượng hộ dân trong khu phố: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Nhập thông tin hộ gia đình thứ " + i + ":");
            System.out.print("Nhập số nhà: ");
            int soNha = sc.nextInt();
            sc.nextLine();
            System.out.print("Nhập số thành viên trong gia đình: ");
            int soNguoi = sc.nextInt();
            sc.nextLine();
            HoGiaDinh hoGiaDinh = new HoGiaDinh(soNha, soNguoi);

            for (int j = 1; j <= soNguoi; j++) {
                System.out.println("Nhập thông tin người thứ " + j + ":");
                System.out.println("Họ tên: ");
                String hoTen = sc.nextLine();
                System.out.println("Tuổi: ");
                int tuoi = sc.nextInt();
                sc.nextLine();
                System.out.println("Nghề nghiệp: ");
                String ngheNghiep = sc.nextLine();
                System.out.println("Số căn cước: ");
                String soCanCuoc = sc.nextLine();
                hoGiaDinh.themNguoi(new Nguoi(hoTen, tuoi, ngheNghiep, soCanCuoc));
            }
            khuPho.themGiaDinh(hoGiaDinh);
        }
        System.out.println("\nThông tin các hộ gia đình trong khu phố: ");
        khuPho.hienThiThongTin();

        sc.close();
    }
}
