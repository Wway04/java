package bai_tap;

import java.util.Scanner;

// Viết chương trình cho phép nhập vào một chuỗi
// Kiểm tra xem chuỗi này ký tự “a” xuất hiện bao nhiêu lần
// In ra số lần đó.
public class bai_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int charACount = 0;
        scanner.close();
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'a') {
                charACount++;
            }
        }
        System.out.println("The frequency of the charater 'a' in the string:\"" + line + "\" is: " + charACount);
    }
}
