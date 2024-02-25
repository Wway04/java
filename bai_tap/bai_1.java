package bai_tap;

import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soNguyen = 0;
        soNguyen = scanner.nextInt();
        scanner.close();
        System.out.println(soNguyen >= 0 ? "So nguyen duong" : "So nguyen am");
    }
}
