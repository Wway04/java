package ThuVien;

import java.util.Scanner;

public class Sach extends TaiLieu {
    private String tenTacGia;
    private int soTrang;
    static Scanner scanner = new Scanner(System.in);

    Sach() {
        super();
        tenTacGia = "";
        soTrang = 0;
    }

    Sach(String maTaiLieu, String tenNXB, int soBanPH, String tenTacGia, int soTrang) {
        super(maTaiLieu, tenNXB, soBanPH);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    @Override
    public void nhap() {
        System.out.println("Hay nhap cac thong tin cua sach");
        super.nhap();
        System.out.println("Hay nhap ten tac gia");
        this.tenTacGia = scanner.nextLine();
        System.out.println("Hay nhap so trang");
        this.soTrang = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Sach [maTaiLieu=" + maTaiLieu + ", tenNXB=" + tenNXB + ", soBanPH=" + soBanPH + ", tenTacGia="
                + tenTacGia + ", soTrang=" + soTrang
                + "]";
    }

}
