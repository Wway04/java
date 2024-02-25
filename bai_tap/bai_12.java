package bai_tap;

import java.util.Scanner;

// Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên dương.
// Cuối cùng, chương trình sẽ xuất ra phần tử có giá trị lớn nhất
public class bai_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int maxValue = 0;
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            maxValue = maxValue > value ? maxValue : value;
        }
        scanner.close();
        System.out.println("The maximum element: " + maxValue);
    }
}
