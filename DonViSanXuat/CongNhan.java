package DonViSanXuat;

import java.util.Scanner;

public class CongNhan extends CanBo {
    private int bac;

    static Scanner scanner = new Scanner(System.in);

    CongNhan() {
        super();
        bac = 0;
    }

    CongNhan(String hoTen, int tuoi, String gioiTinh, String diaChi, int bac) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }

    public void nhap() {
        super.nhap();
        System.out.println("Nhap bac:");
        bac = scanner.nextInt();
        scanner.nextLine();
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    @Override
    public String toString() {

        return "CongNhan [hoTen=" + getHoTen() + ", tuoi=" + getTuoi() + ", gioiTinh=" + getGioiTinh() + ", diaChi="
                + getDiaChi() + ", bac=" + bac + "]";
    }

}
