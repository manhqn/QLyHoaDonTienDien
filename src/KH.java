class KH {
    protected String maKhachHang;
    protected String hoTen;
    protected String ngayRaHoaDon;
    protected double soLuong;
    protected double donGia;

    public KH(String maKhachHang, String hoTen, String ngayRaHoaDon, double soLuong, double donGia) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.ngayRaHoaDon = ngayRaHoaDon;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public double tinhThanhTien() {
        return soLuong * donGia;
    }

    public String toString() {
        return "Ma KH: " + maKhachHang + ", Ho ten: " + hoTen + ", Ngay ra hoa don: " + ngayRaHoaDon + ", Thanh tien: " + tinhThanhTien();
    }
}
