package bai_tap;

import java.util.Scanner;

// Viết chương trình cho phép người dùng nhập vào một chuỗi, sau đó nhập vào một ký tự.
// Kiểm tra xem ký tự nhập vào đó nằm ở vị trí thứ mấy trong chuỗi(nếu có, số đếm bắt đầu từ 0).
// Nếu nó có xuất hiện trong chuỗi thì in ra vị trí của nó trong chuỗi
// Nếu không thì in ra “Không tồn tại trong chuỗi”.
public class bai_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner);
        String line = scanner.nextLine();
        char charValue = scanner.next().charAt(0);
        scanner.close();
        for (int i = 0; i < line.length(); i++) {
            if (charValue == line.charAt(i)) {
                System.out.println(
                        "Yes!, the character:" + charValue + " appears at index " + i + " in the string:" + line);
                return;
            }
        }
        System.out.println("The character:" + charValue + " does not exist in the string:" + line);
    }
}
