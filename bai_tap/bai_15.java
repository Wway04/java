package bai_tap;

import java.util.Scanner;

// Viết chương trình cho phép người dùng nhập vào 5 mã số,lưu 5 mã số này vào một mảng.
// Chương trình sẽ kiểm tra xem trong 5 mã số này có mã số nào sai định dạng hay không 
// (định dạng là “00yLxxxx” với y là số nguyên từ 2 - 5, x là số nguyên từ 0-9).
// Nếu có bất kỳ mã số nào sai định dạng thì chương trình in ra “Sai rồi” rồi kết thúc chương trình, ngược lại thì in ra “Đúng rồi”. 
// (Sử dụng biểu thức chính quy để ràng buộc định dạng)
public class bai_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "00[2-5]L\\d{4}";
        String[] codes = new String[5];
        for (int i = 0; i < codes.length; i++) {
            codes[i] = scanner.nextLine();
        }
        scanner.close();
        for (String code : codes) {
            if (!code.matches(regex)) {
                System.out.println("Wrong!");
                return;
            }
        }
        System.out.println("Correct!");
    }
}
