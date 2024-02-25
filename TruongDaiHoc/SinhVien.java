package TruongDaiHoc;

public class SinhVien {
    private String hoTen;

    private double diem;

    public SinhVien() {
        hoTen = "No name";
        diem = 0.0d;
    }

    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }

    public SinhVien(String hoTen) {
        System.out.println(hoTen);
    }

    public void showInfo() {
        System.out.println(hoTen + " : " + diem);
    }

    @Override
    public String toString() {
        return "SinhVien [hoTen=" + hoTen + ", diem=" + diem + "]";
    }
}
