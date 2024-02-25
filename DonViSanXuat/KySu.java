package DonViSanXuat;

import java.util.Scanner;

public class KySu extends CanBo {
    private String nganhDaoTao;

    static Scanner scanner = new Scanner(System.in);

    KySu() {
        super();
        nganhDaoTao = "";
    }

    KySu(String hoTen, int tuoi, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public void nhap() {
        super.nhap();
        System.out.println("Nhap nganh dao tao:");
        nganhDaoTao = scanner.nextLine();
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    @Override
    public String toString() {

        return "KySu [hoTen=" + getHoTen() + ", tuoi=" + getTuoi() + ", gioiTinh=" + getGioiTinh() + ", diaChi="
                + getDiaChi() + ", nganhDaoTao=" + nganhDaoTao + "]";
    }

}
