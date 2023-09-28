class KhachNN extends KH {
    private String quocTich;

    public KhachNN(String maKhachHang, String hoTen, String ngayRaHoaDon, double soLuong, double donGia, String quocTich) {
        super(maKhachHang, hoTen, ngayRaHoaDon, soLuong, donGia);
        this.quocTich = quocTich;
    }

    public String toString() {
        return super.toString() + ", Quoc Tich: " + quocTich;
    }
}
