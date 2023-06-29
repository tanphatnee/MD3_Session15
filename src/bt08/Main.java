package bt08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            checkSNT(n);
        } catch (Exception e) {
            System.err.println("Đây không phải là số");
            e.printStackTrace();
        }
    }

    public static void checkSNT(int n) {
        boolean check = false;
        if (n <= 1) {
            check = true;
        }

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                check = true;
            }
        }
        if (check) {
            System.out.println(n + " Không phải là số nguyên tố");
            return;
        }
        System.out.println(n + " Là số nguyên tố");
    }
}
