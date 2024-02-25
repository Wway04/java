package bai_tap;

import java.util.Scanner;

// Viết chương trình cho phép nhập vào 3 số thực
// Chương trình này sẽ kiểm tra 3 số này có phải là 3 cạnh của một tam giác hay không.
// Nhap 3 so thuc
// Dieu kien de ra 1 tam giac
// In ra ket qua
public class bai_3 {
    public static void main(String[] args) {
        float a, b, c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();
        scanner.close();
        boolean isTriangle = true;
        if (a + b <= c || a + c <= b || b + c <= a)
            isTriangle = false;
        System.out.println(isTriangle ? "This is triangle" : "This isn't triangle");
    }
}
