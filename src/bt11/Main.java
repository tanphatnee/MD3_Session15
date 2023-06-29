package bt11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();
            if (year < 0) {
                throw new Exception("Không được nhập năm nhỏ hơn 0");
            }
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                if (day < 0 || day > 31) {
                    throw new Exception(" Không được nhập ngày nhỏ hơn 0 và lớn hơn 31");
                }
            }
            if (month == 2) {
                if (day < 0 || day > 29) {
                    throw new Exception(" Không được nhập ngày nhỏ hơn 0 và lớn hơn 29");
                }
            }
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day < 0 || day > 30) {
                    throw new Exception(" Không được nhập ngày nhỏ hơn 0 và lớn hơn 30");
                }
            }
            System.out.println(day + "/" + month + "/" + year);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
