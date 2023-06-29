package bt04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi số: ");
        String str = sc.nextLine();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            try {
                list.add(Integer.parseInt(String.valueOf(str.charAt(i))));
            } catch (NumberFormatException e) {
                list.add(0);
                e.printStackTrace();
            }
        }

        System.out.println(list);
    }
}
