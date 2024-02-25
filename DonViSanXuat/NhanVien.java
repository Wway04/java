package DonViSanXuat;

import java.util.Scanner;

public class NhanVien extends CanBo {
    private String congViec;

    static Scanner scanner = new Scanner(System.in);

    NhanVien() {
        super();
        congViec = "";
    }

    NhanVien(String hoTen, int tuoi, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public void nhap() {
        super.nhap();
        System.out.println("Nhap cong viec:");
        congViec = scanner.nextLine();
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    @Override
    public String toString() {

        return "NhanVien [hoTen=" + getHoTen() + ", tuoi=" + getTuoi() + ", gioiTinh=" + getGioiTinh() + ", diaChi="
                + getDiaChi() + ", congViec=" + congViec + "]";
    }

}
