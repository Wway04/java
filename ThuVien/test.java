package ThuVien;

import java.util.Scanner;

public class test {
    static Scanner scanner = new Scanner(System.in);

    static void menu(QuanLiSach quanLiSach) {
        int luaChon = 0;
        while (true) {
            System.out.println("1.Thêm mới tài liêu: Sách, tạp chí, báo.");
            System.out.println("2.Xoá tài liệu theo mã tài liệu");
            System.out.println("3.Hiện thị thông tin về tài liệu.");
            System.out.println("4.Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.");
            System.out.println("5.Thoát khỏi chương trình.");
            luaChon = scanner.nextInt();
            scanner.nextLine();
            if (luaChon == 1) {
                TaiLieu taiLieu = new TaiLieu();
                System.out.println("1.Thêm mới sách");
                System.out.println("2.Thêm mới tạp chí");
                System.out.println("3.Thêm mới báo");
                int luaChon1 = scanner.nextInt();
                if (luaChon1 == 1) {
                    taiLieu = new Sach();
                    taiLieu.loai = 1;
                    taiLieu.nhap();
                } else if (luaChon1 == 2) {
                    taiLieu = new TapChi();
                    taiLieu.loai = 2;
                    taiLieu.nhap();

                } else if (luaChon1 == 3) {
                    taiLieu = new Bao();
                    taiLieu.loai = 3;
                    taiLieu.nhap();
                }
                quanLiSach.addDocument(taiLieu);
            } else if (luaChon == 2) {
                System.out.println("Nhập mã tài liệu muốn xóa");
                String idDocumentDelete = scanner.nextLine();
                quanLiSach.deleteDocumentById(idDocumentDelete);
            } else if (luaChon == 3) {
                quanLiSach.showDocuments();
            } else if (luaChon == 4) {
                System.out.println("Nhập loại tài liệu muốn tìm kiếm (theo 1,2,3)");
                int loai = scanner.nextInt();
                quanLiSach.showDocumentsByType(loai);
            } else if (luaChon == 5) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        QuanLiSach quanLiSach = new QuanLiSach();
        menu(quanLiSach);
        scanner.close();
    }
}
