package bai_tap;

import java.util.Scanner;

// Viết chương trình cho phép nhập vào một số nguyên dương n, tính tổng tất cả số chẵn trong khoảng từ 0 - n.
// 1.Nhap so nguyen n
// 2.Tinh tong cac so chan tu 0-n
// 3.In ra tong
public class bai_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int evenSum = 0;
        n = scanner.nextInt();
        scanner.close();
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            }
        }
        System.out.println(evenSum);
    }
}
