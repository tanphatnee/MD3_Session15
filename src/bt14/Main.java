package bt14;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        if (arr.length == 0) {
            throw new Exception("Mảng không hợp lệ");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            try {
                sum += arr[i];
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
