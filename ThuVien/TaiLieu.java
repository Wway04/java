package ThuVien;

import java.util.Scanner;

public class TaiLieu {
    protected String maTaiLieu;
    public int loai;

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    protected String tenNXB;
    protected int soBanPH;
    static Scanner scanner = new Scanner(System.in);

    TaiLieu() {
        maTaiLieu = "";
        tenNXB = "";
        soBanPH = 0;
    }

    TaiLieu(String maTaiLieu, String tenNXB, int soBanPH) {
        this.maTaiLieu = maTaiLieu;
        this.tenNXB = tenNXB;
        this.soBanPH = soBanPH;
    }

    protected void nhap() {
        System.out.println("Hay nhap ma tai lieu");
        this.maTaiLieu = scanner.nextLine();
        System.out.println("Hay nhap ten nha xuat ban");
        this.tenNXB = scanner.nextLine();
        System.out.println("Hay nhap so ban phat hanh");
        this.soBanPH = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return "TaiLieu [maTaiLieu=" + maTaiLieu + ", tenNXB=" + tenNXB + ", soBanPH=" + soBanPH + "]";
    }

}
