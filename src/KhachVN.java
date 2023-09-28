class KhachVN extends KH {
    private String doiTuong;
    private double dinhMuc;

    public KhachVN(String maKhachHang, String hoTen, String ngayRaHoaDon, double soLuong, double donGia, String doiTuong, double dinhMuc) {
        super(maKhachHang, hoTen, ngayRaHoaDon, soLuong, donGia);
        this.doiTuong = doiTuong;
        this.dinhMuc = dinhMuc;
    }

    public double tinhThanhTien() {
        if (soLuong <= dinhMuc) {
            return soLuong * donGia;
        } else {
            return soLuong * donGia * dinhMuc + (soLuong - dinhMuc) * donGia * 2.5;
        }
    }

    public String toString() {
        return super.toString() + ", Doi tuong: " + doiTuong;
    }
}
