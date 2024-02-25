package bai_tap;

import java.util.Scanner;

// Viết chương trình cho phép nhập vào một số nguyên n ( n < 1000 )
// In ra tất cả số nguyên tố trong khoảng từ 0-n.

public class bai_8 {
    static boolean isPrimeNumber(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = 0;
        n = scanner.nextInt();
        scanner.close();
        for (int i = 0; i <= n; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i + " is Prime number");
            }
        }
    }
}
