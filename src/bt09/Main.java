package bt09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            if (n < 0) {
                throw new Exception("Không được nhập nhỏ hơn 0");
            }
            printFibonacci(n);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printFibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
        System.out.print(f0 + " ");
        System.out.print(f1 + " ");
        System.out.print(fn + " ");
        if (n == 1 || n == 2) {
            System.out.println(n);
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
                System.out.print(fn + " ");
            }
        }
    }
}
