package bt15;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a < 0 || b < 0 || c < 0) {
                throw new Exception("Không được nhập cạnh nhỏ hơn 0");
            }

            if (a + b < c || a + c < b || b + c < a) {
                throw new Exception("Đây không phải một tam giác");
            }

            System.out.println("Đây là tam giác có ba cạnh là a=" + a + " b=" + b + " c=" + c);

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
