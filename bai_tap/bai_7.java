package bai_tap;

import java.util.Scanner;

// Viết chương trình để nhập nhập một số nguyên
// tìm kết quả phép nhân của số đó với các số từ 1 - 20 , 
// sau đó in kết quả ra màn hình.
public class bai_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        n = scanner.nextInt();
        scanner.close();
        for (int i = 0; i <= 20; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
