package bt02;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int max = arr[0];
        if (arr.length == 0) {
            throw new Exception("Mảng không có phần tử");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max: " + max);
    }
}
