package bt07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int max = findMax(a, b);
            System.out.println(max);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int findMax(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

}
