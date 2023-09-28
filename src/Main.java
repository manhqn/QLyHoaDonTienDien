import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<KH> danhSachHoaDon = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Chon loai khach hang (1 - Khach hang VN, 2 - Khach hang NN, 0 - Xuat Hoa Don): ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 0) {
                break;
            }

            System.out.print("Nhap ma khach hang: ");
            String maKhachHang = sc.nextLine();
            System.out.print("Nhap ho ten: ");
            String hoTen = sc.nextLine();
            System.out.print("Nhap ngay ra hoa don (ngay/thang/nam): ");
            String ngayRaHoaDon = sc.nextLine();
            System.out.print("Nhap so luong KW tieu thu: ");
            double soLuong = sc.nextDouble();
            System.out.print("Nhap don gia: ");
            double donGia = sc.nextDouble();

            if (choice == 1) {
                sc.nextLine(); 
                System.out.print("Nhap doi tuong (sinh hoat/kinh doanh/san xuat): ");
                String doiTuong = sc.nextLine();
                System.out.print("Nhap dinh muc: ");
                double dinhMuc = sc.nextDouble();
                danhSachHoaDon.add(new KhachVN(maKhachHang, hoTen, ngayRaHoaDon, soLuong, donGia, doiTuong, dinhMuc));
            } else if (choice == 2) {
                sc.nextLine(); 
                System.out.print("Nhap quoc tich: ");
                String quocTich = sc.nextLine();
                danhSachHoaDon.add(new KhachNN(maKhachHang, hoTen, ngayRaHoaDon, soLuong, donGia, quocTich));
            }
        }

        System.out.println("Danh sach hoa don:");
        for (KH khachHang : danhSachHoaDon) {
            System.out.println(khachHang);
        }
    
        double tongSoLuongKhachVN = 0;
        double tongSoLuongKhachNN = 0;

        for (KH khachHang : danhSachHoaDon) {
            if (khachHang instanceof KhachVN) {
                tongSoLuongKhachVN += khachHang.soLuong;
            } else if (khachHang instanceof KhachNN) {
                tongSoLuongKhachNN += khachHang.soLuong;
            }
        }


        System.out.println("Tong so luong khach VN: " + tongSoLuongKhachVN);
        System.out.println("Tong so luong khach NN: " + tongSoLuongKhachNN);

        double tongThanhTienKhachNN = 0;
        int soKhachNN = 0;

        for (KH khachHang : danhSachHoaDon) {
            if (khachHang instanceof KhachNN) {
                tongThanhTienKhachNN += khachHang.tinhThanhTien();
                soKhachNN++;
            }
        }

        double trungBinhThanhTienKhachNN = 0;

        if (soKhachNN > 0) {
            trungBinhThanhTienKhachNN = tongThanhTienKhachNN / soKhachNN;
        }

        System.out.println("Trung binh tien cua khach NN: " + trungBinhThanhTienKhachNN);
        System.out.println("Danh sach hoa don trong thang 09 nam 2013:");
        for (KH khachHang : danhSachHoaDon) {
            if (khachHang.ngayRaHoaDon.contains("09/2013")) {
                System.out.println(khachHang);
            }
        }
    }
}
