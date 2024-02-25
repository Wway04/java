package DonViSanXuat;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {

    static Scanner scanner = new Scanner(System.in);

    static void themCanBo(ArrayList<CanBo> canBoList) {
        CanBo canBo;
        System.out.println(" 1.1 Them cong nhan");
        System.out.println(" 1.2 Them ky su");
        System.out.println(" 1.2 Them nhan vien");
        int luaChon1 = scanner.nextInt();
        if (luaChon1 == 1) {
            canBo = new CongNhan();
            canBo.loai = 1;
            canBo.nhap();
            canBoList.add(canBo);
        } else if (luaChon1 == 2) {
            canBo = new KySu();
            canBo.loai = 2;
            canBo.nhap();
            canBoList.add(canBo);
        } else if (luaChon1 == 3) {
            canBo = new NhanVien();
            canBo.loai = 3;
            canBo.nhap();
            canBoList.add(canBo);
        }

    }

    static boolean timCanBoTheoTen(String hoTen, CanBo canBo) {
        String regex = "^" + hoTen;
        System.out.println(regex);
        System.out.println(canBo.getHoTen());
        if (canBo.getHoTen().matches(regex))
            return true;
        return false;
    }

    static void show(ArrayList<CanBo> canBoList) {
        for (CanBo canBo : canBoList) {
            System.out.println(canBo);
        }
    }

    static boolean exit() {
        return false;
    }

    static void menu(ArrayList<CanBo> canBoList) {
        int luaChon = 0;
        while (true) {
            System.out.println(" 1.Them moi mot can bo");
            System.out.println(" 2.Tim can bo theo ho ten");
            System.out.println(" 3.Danh sach cac can bo");
            System.out.println(" 4.Thoat chuong trinh");
            luaChon = scanner.nextInt();
            scanner.nextLine();
            if (luaChon == 1) {
                themCanBo(canBoList);
            } else if (luaChon == 2) {
                System.out.println("Nhap ho ten de tim can bo");
                String hoTen = scanner.nextLine();
                for (CanBo canBo : canBoList) {
                    if (timCanBoTheoTen(hoTen, canBo)) {
                        System.out.println(canBo);
                    }
                }

            } else if (luaChon == 3) {
                show(canBoList);
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<CanBo> canBoList = new ArrayList<CanBo>();
        menu(canBoList);
        scanner.close();
    }
}
