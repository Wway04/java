package ThuVien;

import java.util.Scanner;

public class TapChi extends TaiLieu {
    private int thangPhatHanh;
    private int soPhatHanh;
    static Scanner scanner = new Scanner(System.in);

    TapChi() {
        super();
        thangPhatHanh = 0;
        soPhatHanh = 0;
    }

    TapChi(String maTaiLieu, String tenNXB, int soBanPH, int thangPhatHanh, int soPhatHanh) {
        super(maTaiLieu, tenNXB, soBanPH);
        this.thangPhatHanh = thangPhatHanh;
        this.soPhatHanh = soPhatHanh;
    }

    @Override
    public void nhap() {
        System.out.println("Hay nhap cac thong tin cua Tap Chi");
        super.nhap();
        System.out.println("Hay nhap so phat hanh");
        this.soPhatHanh = scanner.nextInt();
        // scanner.nextLine();
        System.out.println("Hay nhap thang phat hanh");
        this.thangPhatHanh = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return "TapChi [maTaiLieu=" + maTaiLieu + ", tenNXB=" + tenNXB + ", soBanPH=" + soBanPH + ", soPhatHanh="
                + soPhatHanh + ", thangPhatHanh=" + thangPhatHanh
                + "]";
    }

}
