package bai_tap;

import java.util.Scanner;

// Viết chương trình cho phép nhập vào số nguyên n( n <= 20 )
// in ra số Fibonacci ứng với nó.
// Số Fibonacci là số mà nó bằng tổng của 2 số Fibonacci trước nó.
// Với giả thuyết là Fi(0)=1,Fi(1)=1.
// Ta có ví dụ:Fi(2)=Fi(0)+Fi(1)=1+1=2,Fi(3)=Fi(2)+Fi(1)=2+1=3,Fi(4)=Fi(3)+Fi(2)=3+2=5,
// …Giả sử n=4,đầu ra sẽ là 5
// nhap n -> tinh f(n - 1) + f(n - 2)
// 3 -> f(2) + f(1) -> f(2) = ? -> i = 2 -> f(0), f(1); i = 3 -> f(1), f(2)
public class bai_9 {
    static int fibonacci(int n) {
        if (n == 1 || n == 0)
            return 1;
        int fx1 = 1, fx2 = 1;
        for (int i = 2; i < n; i++) {
            int current = fx2;
            fx2 += fx1;
            fx1 = current;
        }
        return fx1 + fx2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
