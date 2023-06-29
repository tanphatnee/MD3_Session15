package bt10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            double n = sc.nextInt();
            if (n < 0) {
                throw new Exception("Không được nhập bán kính nhỏ hơn không");
            }
            printArea(n);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printArea(double n) {
        System.out.println(3.14 * n * n);
    }
}
