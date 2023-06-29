package bt13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            String text = new Scanner(System.in).nextLine();
            if (text.trim().equals("")) {
                throw new Exception("Không được bỏ trống");
            }
            String reversedText = null;
            for (int i = text.length() - 1; i > 0; i--) {
                reversedText += String.valueOf(text.charAt(i));
            }
            System.out.println(reversedText);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
