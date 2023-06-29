package bt12;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a < 0 || b < 0) {
                throw new Exception("Không được nhập số nhỏ hơn 0");
            }
            findUCLN(a, b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void findUCLN(int a, int b) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            if (a % i == 0) {
                list1.add(i);
            }
        }
        for (int i = 0; i < b; i++) {
            if (b % i == 0) {
                list2.add(i);
            }
        }

        List<Integer> myList = new ArrayList<>();
        if (list1.size() <= list2.size()) {
            for (int i : list2) {
                for (int j : list1) {
                    if (i == j) {
                        myList.add(j);
                    }
                }
            }
        }
        Collections.sort(myList);
        System.out.println("Max : " + myList.get(myList.size() - 1));
    }
}
