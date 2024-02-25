package bai_tap;

import java.util.Scanner;

// Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên.
// Sắp xếp các phần tử trong mảng theo thứ tự ngược lại.
// input: 1, 2, 3, 4, 5
// output:5, 4, 3, 2, 1
public class bai_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        for (int i = 0; i < n / 2; i++) {
            int currentValue = array[n - i - 1];
            array[n - i - 1] = array[i];
            array[i] = currentValue;
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
