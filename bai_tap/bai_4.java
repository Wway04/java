package bai_tap;

import java.util.Scanner;

// Viết chương trình cho phép nhập vào 3 số
// Chương trình sẽ kiểm tra 3 số này có phải là 3 cạnh của một tam giác vuông hay không.
// -> để là 1 tam giác vuông -> có phải là tam giác -> điều kiện để 1 triangle là 1 triangle vuông
public class bai_4 {
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
        if (!isTriangle) {
            System.out.println("This is not a triangle");
            return;
        }
        boolean isRightTriangle = false;
        if (Math.sqrt(a + b) != c || Math.sqrt(a + c) != b || Math.sqrt(b + c) != a)
            isRightTriangle = true;
        System.out.println(isRightTriangle ? "This is a right triangle" : "This isn't a right triangle");

    }
}
