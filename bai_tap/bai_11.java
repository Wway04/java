package bai_tap;

import java.util.Scanner;

// Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên.
// Cuối cùng, chương trình sẽ xuất ra giá trị trung bình của mảng này.
public class bai_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int gradePointAverage = 0;
        for (int i = 0; i < n; i++) {
            gradePointAverage += scanner.nextInt();
        }
        System.out.println(gradePointAverage / n);
    }
}
