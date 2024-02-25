package bai_tap;

import java.util.Scanner;

// Viết chương trình cho phép người dùng nhập vào một chuỗi, sau đó nhập vào một ký tự.
// Kiểm tra xem ký tự đó có xuất hiện trong chuỗi hay không?
//  Nếu có in ra “Có”, ngược lại in ra “Không”.
public class bai_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char charValue = scanner.next().charAt(0);
        scanner.close();
        for (int i = 0; i < line.length(); i++) {
            if (charValue == line.charAt(i)) {
                System.out.println(line.charAt(i));
                System.out.println("Yes!");
                return;
            }
        }
        System.out.println("No");
    }
}
