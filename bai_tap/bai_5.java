package bai_tap;

import java.util.Scanner;

// Viết chương trình cho phép người dùng nhập vào mã số sinh viên
// Sau đó kiểm tra xem mã số này có đúng với định dạng đã cho hay không.
// Định dạng mã số sinh viên là “Bxxxxxxx” với x là số nguyên từ 1-9. (Sử dụng biểu thức chính quy để ràng buộc định dạng)
// Nhap mssv
// Kiểm tra mssv có hơp lệ theo: “Bxxxxxxx”, x: 1-9
// Dùng regex để check
public class bai_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mssv;
        String regex = "B\\d{7}";
        mssv = scanner.nextLine();
        scanner.close();
        boolean isMssv = true;
        if (!mssv.matches(regex))
            isMssv = false;
        System.out.println(isMssv ? "Valid" : "Invalid");
    }
}
