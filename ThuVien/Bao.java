package ThuVien;

import java.util.Scanner;

public class Bao extends TaiLieu {
    private int ngayPhatHanh;
    static Scanner scanner = new Scanner(System.in);

    Bao() {
        super();
        ngayPhatHanh = 0;
    }

    Bao(String maTaiLieu, String tenNXB, int soBanPH, int ngayPhatHanh) {
        super(maTaiLieu, tenNXB, soBanPH);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public void nhap() {
        System.out.println("Hay nhap cac thong tin cua Bao");
        super.nhap();
        System.out.println("Hay nhap ngay phat hanh");
        this.ngayPhatHanh = scanner.nextInt();
        // scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Bao [maTaiLieu=" + maTaiLieu + ", tenNXB=" + tenNXB + ", soBanPH=" + soBanPH + ", ="
                + ", ngayPhatHanh=" + ngayPhatHanh
                + "]";
    }

}
