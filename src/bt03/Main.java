package bt03;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int sum = 0;
        for (int a : arr) {
            try {
                sum += a;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Tổng: " + sum);
    }
}
