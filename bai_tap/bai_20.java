package bai_tap;
// Viết chương trình cho phép người dùng nhập vào 1 chuỗi

import java.util.Scanner;

//  kiểm tra chuỗi này có phù hợp với yêu cầu hay không.
// Nếu có thì in ra “Duyệt!”, ngược lại in ra “Không duyệt”.
// Yêu cầu về chuỗi là: 
// Có độ dài không quá 20 ký tự, string.length <= 20
// không được chứa ký tự khoảng trắng, \S
// bắt đầu bằng một ký tự chữ viết hoa (A - Z), ^[A-Z]
// kết thúc bằng một số (0 - 9). [/d]$
// (Sử dụng biểu thức chính quy để ràng buộc định dạng)

public class bai_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "^[A-Z][\\S]{0,18}\\d$";
        String line = scanner.nextLine();
        scanner.close();
        if (line.length() > 20) {
            System.out.println("Không duyệt");
            return;
        }
        if (!line.matches(regex)) {
            System.out.println("Không duyệt");
            return;
        }
        System.out.println("Duyệt");

    }

}
