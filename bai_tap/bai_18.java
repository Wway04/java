package bai_tap;

import java.util.Scanner;

// Viết chương trình cho phép nhập vào một chuỗi
// kiểm tra xem chuỗi này có xuất hiện số hay không.
// Nếu có tin ra “Có”, ngược lại, in ra “Không”.
// check number by ascii: 0 - 9 -> ascii: 48 - 57
public class bai_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();
        for (int i = 0; i < line.length(); i++) {
            int asciiChar = (int) line.charAt(i);
            if (asciiChar >= 48 && asciiChar <= 57) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
