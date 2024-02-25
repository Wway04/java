package DonViSanXuat;

import java.util.Scanner;

public abstract class CanBo {
    protected String hoTen;
    protected int tuoi;
    protected String gioiTinh;
    protected String diaChi;
    public int loai;

    static Scanner scanner = new Scanner(System.in);

    CanBo() {
        hoTen = "";
        tuoi = 0;
        gioiTinh = "";
        diaChi = "";
    }

    CanBo(String hoTen, int tuoi, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public void nhap() {
        System.out.println("Nhap ten");
        hoTen = scanner.nextLine();
        System.out.println("Nhap tuoi");
        tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap gioi tinh");
        gioiTinh = scanner.nextLine();
        System.out.println("Nhap dia chi");
        diaChi = scanner.nextLine();
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    @Override
    public String toString() {
        return "CanBo [hoTen=" + hoTen + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + "]";
    }
}
