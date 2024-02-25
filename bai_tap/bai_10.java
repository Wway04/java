package bai_tap;

import java.util.Scanner;

// Viết chương trình cho phép người dùng nhập vào 5 mã số sinh viên.
// Kiểm tra xem mã số sinh viên này có đúng với định dạng hay chưa.
// Với định dạng mã số sinh viên là “B170xxxx” với x là số nguyên từ 1-9. (Sử dụng biểu thức chính quy để ràng buộc định dạng)
public class bai_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "B170\\d{4}";
        String[] studentId = new String[5];
        System.out.println("Hay nhap student id");
        for (int i = 0; i < 5; i++) {
            studentId[i] = scanner.nextLine();
        }
        scanner.close();
        for (String a : studentId) {
            if (a.matches(regex)) {
                System.out.println(a + " :is a student id");
            }
        }
    }
}
