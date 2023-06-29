package bt05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int target = 15;
		try {
			int index = searchBinary(arr, target);
			System.out.println(target + " Nằm tại vị trí " + index);
		} catch (Exception e) {
			e.printStackTrace();
		}
//		if (index == ) {
//			System.out.println("Không tìm thấy");
//		} else {
//			System.out.println(target + " Nằm tại vị trí " + index);
//		}
	}
	
	public static int searchBinary(int[] arr, int target) throws Exception {
		int low = 0;
		int high = arr.length - 1;
		while (high >= low) {
			int mid = (high + low) / 2;
			if (arr[mid] < target) {
				low = mid + 1;
			} else if (arr[mid] > target) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		throw new Exception("Không có phần tử");
	}
	
}
