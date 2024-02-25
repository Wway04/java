package bai_tap;

import java.util.Scanner;

// Viết chương trình cho phép nhập vào n
// sau đó nhập vào n phần tử số nguyên (có thể dương hoặc âm).
// Cuối cùng, chương trình sẽ xuất ra phần tử có giá trị nhỏ nhất.
public class bai_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int minValue = 100;
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            minValue = (minValue > value) ? value : minValue;
        }
        scanner.close();
        System.out.println("The minimum element: " + minValue);
    }
}
